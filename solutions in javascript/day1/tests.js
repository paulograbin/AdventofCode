var char = require('chai');
var expect = char.expect;
var firstHalf = require('./firstHalf.js');
var secondHalf = require('./secondHalf.js');

/*
 *	FIRST HALF
 */
describe('Day 1 - First Half', function() {
	it('should return 0', function() {
		expect(firstHalf("(())")).to.equal(0);
	});
});

describe('Day 1 - First Half', function() {
	it('should return 0 too', function() {
		expect(firstHalf("()()")).to.equal(0);
	});
});


describe('Day 1 - First Half', function() {
	it('should return 3', function() {
		expect(firstHalf("(((")).to.equal(3);
	});
});

describe('Day 1 - First Half', function() {
	it('should return 3 too', function() {
		expect(firstHalf("(()(()(")).to.equal(3);
	});
});

describe('Day 1 - First Half', function() {
	it('should return 3 again', function() {
		expect(firstHalf("))(((((")).to.equal(3);
	});
});


describe('Day 1 - First Half', function() {
	it('should return -1', function() {
		expect(firstHalf("())")).to.equal(-1);
	});
});

describe('Day 1 - First Half', function() {
	it('should return -1 again', function() {
		expect(firstHalf("))(")).to.equal(-1);
	});
});



describe('Day 1 - First Half', function() {
	it('should return -3', function() {
		expect(firstHalf(")))")).to.equal(-3);
	});
});

describe('Day 1 - First Half', function() {
	it('should return -3 again', function() {
		expect(firstHalf(")())())")).to.equal(-3);
	});
});

/*
 * Second Half
 */
describe('Day 1 - Second Half', function() {
	it('should return 1', function() {
		expect(secondHalf(")")).to.equal(1);
	});
});

describe('Day 1 - Second Half', function() {
	it('should return 5', function() {
		expect(secondHalf("()())")).to.equal(5);
	});
});