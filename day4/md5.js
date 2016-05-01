'use strict';

var crypto = require('crypto');
var digest = 'hex';

exports.calculateMD5Hash = (data) => {
	// console.log("Calculating hash for data... ");

	var hasher = crypto.createHash('md5');
	var resultingHash = hasher.update(data.toString()).digest(digest);

	// console.log("Hash: " + resultingHash);
	return resultingHash;
};