var fs = require('fs');

read(process.argv[2]);

function read(path) {
	fs.readFile(path, 'utf-8', function(err, content) {
		if(err) throw err;

		var sum = 0;

		for(i = 1; i < content.length + 1; i++) {
			var char = content.substring(i-1, i);

			if(char == '(')
				sum++;
			else if(char == ')')
				sum--;
		}

		console.log(sum);
	})
}

