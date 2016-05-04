// Day 5: For . . . Of
// https://www.hackerrank.com/contests/7days-javascript/challenges/js-for-of
// created by hendrawd
// weird... cannot use let instead of var

var reverse = s => s.split("").reverse().join("");

for(var s of my_array){
	if(s === reverse(s))
		console.log(s);
}