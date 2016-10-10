var chai = require('chai');
var expect = chai.expect;
var firstHalf = require('./firstHalf.js');
var secondHalf = require('./secondHalf.js');

/*
 *	FIRST HALF
 */

describe('Day 2 - First Half', function() {
	it('2x3x4 should return 58', function() {
		expect(firstHalf("2x3x4")).to.equal(58);
	});
});


describe('Day 2 - Second Half', function() {
	it('2x3x4 should return 34', function() {
		expect(secondHalf("2x3x4")).to.equal(34);
	});
});

describe('Day 2 - Second Half', function() {
	it('1x1x10 should return 14', function() {
		expect(secondHalf("1x1x10")).to.equal(14);
	});
});
