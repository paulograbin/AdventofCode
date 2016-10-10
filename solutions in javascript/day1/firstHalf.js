function firstHalf(content) {
	console.log("First half...")
	sum = 0;

	for(i = 1; i < content.length + 1; i++) {
		var char = content.substring(i-1, i);

		if(char == '(')
			sum++;
		else if(char == ')')
			sum--;
	}

	return sum;
};

module.exports = firstHalf;