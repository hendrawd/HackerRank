// Day 2: Objects
// https://www.hackerrank.com/contests/7days-javascript/challenges/objects
function printObjectProperty(myObject) {
	console.log(myObject);
} 

// tail starts here
process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
//example input
_input = "Fiat 500 White";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
    var obj = _input.split(' ');
    var myObject = new Object;
    myObject.type = obj[0];
    myObject.model = obj[1];
    myObject.color = obj[2];

    printObjectProperty(myObject);
});