// Day 3: Find the Day
// https://www.hackerrank.com/contests/7days-javascript/challenges/find-the-month
// created by hendrawd

function findDay(myDate) {
    // Return day for date myDate(MM/DD/YYYY)
    // Note that myDate contains the date in string format
    if (myDate!="-1") {
    	var d = new Date(myDate);
    	switch(d.getDay()){
    		case 0:
    		console.log("Sunday");
    		break;
    		case 1:
    		console.log("Monday");
    		break;
    		case 2:
    		console.log("Tuesday");
    		break;
    		case 3:
    		console.log("Wednesday");
    		break;
    		case 4:
    		console.log("Thursday");
    		break;
    		case 5:
    		console.log("Friday");
    		break;
    		case 6:
    		console.log("Saturday");
    		break;
    	}
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
	var dates = _input.split('\n');

	for (var i = 0; i < dates.length - 1; i++) {
		findDay(dates[i]);
	}
});