var fs = require('fs');
var firstHalf = require('./firstHalf');
var secondHalf = require('./secondHalf');


read(process.argv[2]);

function read(file) {
	fs.readFile(file, 'utf-8', function(err, content) {
		console.log("Solution:", firstHalf(content));
		console.log("Solution:", secondHalf(content));
	})
};