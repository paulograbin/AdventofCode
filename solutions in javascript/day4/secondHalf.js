'use strict';
var md5 = require('./md5.js');

var lastNumber = 0;

calculateCorrectHash(process.argv[2]);

function calculateCorrectHash(input) {
	var hash = fetchMD5Hash(input);

	while(!startsWithSixZeros(hash)) {
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

function startsWithSixZeros(input) {
	return input.startsWith('000000');
}

function getNextNumber() {
	return lastNumber = lastNumber + 1;
}

module.exports = calculateCorrectHash;