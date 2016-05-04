// Day 1: Loops
// https://www.hackerrank.com/contests/javascript-week2/challenges/day-1-loops

function vowelsAndConsonants(s) {
	var vocalList = ['a','e','i','o','u'];
	var stackVocals = [];
	var stackS = s.split('');
	for (var i = stackS.length - 1; i >= 0; i--) {
		var char = s.charAt(i);
		for (var j = 4; j >= 0; j--) {
			if(vocalList[j] == char){
				stackVocals.push(char);
				stackS.splice(i, 1);
				break;
			}
		}
	}
	for (var i = stackVocals.length - 1; i >= 0; i--) {
		console.log(stackVocals[i]);
	}
	for (var i = 0; i < stackS.length; i++) {
		console.log(stackS[i]);
	}
}