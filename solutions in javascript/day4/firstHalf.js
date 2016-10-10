'use strict';
var md5 = require('./md5.js');

var lastNumber = 0;

calculateCorrectHash(process.argv[2]);

function calculateCorrectHash(input) {
	var hash = fetchMD5Hash(input);

	while(!startsWithFiveZeros(hash)) {
		lastNumber = getNextNumber();
		hash = fetchMD5Hash(input + lastNumber);
		
		console.log(input, lastNumber, hash);
	}

	console.log(lastNumber);
	return lastNumber;
}

function fetchMD5Hash(string) {
	return md5.calculateMD5Hash(string);
}

function startsWithFiveZeros(input) {
	return input.startsWith('00000');
}

function getNextNumber() {
	return lastNumber = lastNumber + 1;
}

module.exports = calculateCorrectHash;