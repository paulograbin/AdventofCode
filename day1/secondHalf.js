function secondHalf(content) {
	console.log("Second half")
	sum = 0;

	for(i = 0; i < content.length + 1; i++) {
		var char = content.substring(i, i+1);

		if(char == '(') 
			sum++;
		else if(char == ')')
			sum--;
		
		if(sum == -1)
			return i + 1;
	}
};

module.exports = secondHalf;