'use strict';

function secondHalf(content) {
	console.log("Second half")
	var totalRibbon = 0;
	var lines = content.split('\n');

	for(var i = 0; i < lines.length; i++) {
		var values = lines[i].split('x');

		var l = +values[0];
		var w = +values[1];
		var h = +values[2];

		var wrap = calculateWrap(l, w, h);
		// console.log("wrap", wrap);
		var bow = calculateBow(l, w, h);
		// console.log("bow", bow);
		var teste = 2*l + 2*w + l*w*h;
		// console.log("teste", teste);

		var total = wrap +bow;
		// console.log("total for one", total);
		totalRibbon = totalRibbon +total;
		// console.log("totalRibbon", totalRibbon);
	}

	return totalRibbon;
};

function calculateWrap(s1, s2, s3) {
	if(s1 >= s2)
		if(s1 >= s3)
			return s2*2 + s3*2;
		else
			return s1*2 + s2*2;
	else if (s2 >= s3)
			return s1*2 + s3*2;
		 else
		 	return s1*2 + s2*2;
}

function calculateBow(l, w, h) {
	return l*w*h;
}

module.exports = secondHalf;