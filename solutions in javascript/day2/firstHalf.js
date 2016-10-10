function firstHalf(content) {
	console.log("First half...")

	var lines = content.split('\n');
	var paperNeeded = 0;

	for(i = 0; i < lines.length; i++) {
		// console.log("*****")
		var length = 0;
		var width = 0;
		var height = 0;

		var surface1 = 0;
		var surface2 = 0;
		var surface3 = 0;

		var sides = lines[i].split('x');

		length = sides[0];
		width = sides[1];
		height = sides[2];
		// console.log("dimens", length, width, height);

		surface1 = calculateSideSize(length, width);
		surface2 = calculateSideSize(width, height);
		surface3 = calculateSideSize(length, height);
		// console.log("surfaces", surface1, surface2, surface3);

		var smallestSide = getSmallestSide(surface1/2, surface2/2, surface3/2);
		// console.log("smallest", smallestSide);

		var sum = surface1 + surface2 + surface3 + smallestSide;
		// console.log("total", sum);

		paperNeeded = paperNeeded + sum;
	}

	return paperNeeded;
};

function getSmallestSide(s1, s2, s3) {
	if(s1 <= s2)
		if(s1 <= s3)
			return s1;
		else 
			return s3; 
	else if (s2 <= s3)
			return s2;
		 else
		 	return s3;
}

function calculateSideSize(dimension1, dimension2) {
	return (2 * dimension1 * dimension2);
}

module.exports = firstHalf;