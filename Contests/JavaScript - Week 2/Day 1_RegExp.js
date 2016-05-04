// Day 1: RegExp
// https://www.hackerrank.com/contests/javascript-week2/challenges/day-1-regexp

// declare var re here
// var re = /[aeiou]/;
// var re = new RegExp("[aeiou]");
var re = new RegExp("^([aeiou]).+\\1$");

process.stdin.resume();
process.stdin.setEncoding("ascii");

var input = "";

process.stdin.on("data", function (line) {
    input += line;
});

process.stdin.on("end", function () {
    console.log(re.test(input));
});