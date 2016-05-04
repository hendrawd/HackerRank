// Day 4: Basics of Functional JavaScript - Callbacks
// https://www.hackerrank.com/contests/javascript-week2/challenges/js-callbacks

function myFilter(my_array, callback){
	var returnArray = [];
	for (var i = 0; i < my_array.length; i++) {
		if(callback(my_array[i])){
			returnArray.push(my_array[i]);
		}
	}
	return returnArray;
}

function processData(inputArray) {
	console.log(myFilter(inputArray, (x) => x%2==0));   
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
	_input += input;
});

process.stdin.on("end", function () {
	processData(_input.split(' ').map(num => Number(num)));
});
