'use strict';

var char = require('chai');
var expect = char.expect;
var firstHalf = require('./firstHalf.js');
var secondHalf = require('./secondHalf.js');

/* 
 *  FIRST HALF
 */
describe('Day 4 - First Half 1', function() {
	it('should return 609043', function() {
		expect(firstHalf("abcdef").to.equal(609043));
	})
});

describe('Day 4 - First Half 2', function() {
	it('should return 1048970', function() {
		expect(firstHalf("pqrstuv").to.equal(1048970));
	})
});