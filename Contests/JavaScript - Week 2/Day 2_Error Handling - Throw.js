// Day 2: Error Handling - Throw
// https://www.hackerrank.com/contests/javascript-week2/challenges/js-throw

function processData(my_height) {
	try{
		my_height = Number(my_height);
		if (isNaN(my_height)) {
			throw new Error("notANumberError");
		}else{
			if(my_height>10){
				throw new Error("hugeHeightError");
			}
			else if(my_height<4){
				throw new Error("tinyHeightError");
			}
			console.log(my_height);
		}
	}catch(e){
		console.log(e.message);
	}
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
	_input += input;
});

process.stdin.on("end", function () {
	processData(_input);
});
