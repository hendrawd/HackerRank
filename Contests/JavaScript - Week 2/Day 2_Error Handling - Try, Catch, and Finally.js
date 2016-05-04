// Day 2: Error Handling - Try, Catch, and Finally
// https://www.hackerrank.com/contests/javascript-week2/challenges/js-try-catch

function processData(my_string) {
try{
	console.log("Reversed string is : "+my_string.split('').reverse().join(''));
}
catch(e){
	console.log("Error : "+e.message);
}
finally{
	console.log("Type of my_string is : "+type(my_string));
}
}

function type(val){
    return Object.prototype.toString.call(val).replace(/^\[object (.+)\]$/,"$1").toLowerCase();
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(eval(_input));
});
