// Day 3: Find the Second Largest Number in an Array
// https://www.hackerrank.com/contests/7days-javascript/challenges/find-second-largest-number-in-an-array
// created by hendrawd

function processData(myArray) {
	if (myArray.length == 1) {
		console.log(myArray[0]);
	}
	else{
		var largest = Number.MIN_VALUE;
		for (var i = myArray.length - 1; i >= 0; i--) {
			if(myArray[i] > largest){
				largest = myArray[i];
			}
		}
		var secondLargest = Number.MIN_VALUE;
		for (var i = myArray.length - 1; i >= 0; i--) {
			if(myArray[i] > secondLargest && myArray[i] < largest){
				secondLargest = myArray[i];
			}
		}
		console.log(secondLargest);
	}
}

// tail starts here
process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
	_input += input;
});

process.stdin.on("end", function () {
	processData(_input.split('\n')[1].split(' ').map(Number));
});
