var fs = require('fs');
var firstHalf = require('./firstHalf');
var secondHalf = require('./secondHalf');


read(process.argv[2]);

function read(file) {
	fs.readFile(file, 'utf-8', function(err, content) {
		console.log(firstHalf(content));
		console.log(secondHalf(content));
	})
};