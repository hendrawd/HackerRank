// Day 4: Basics of Functional JavaScript - IIFE
// https://www.hackerrank.com/contests/javascript-week2/challenges/js-iife

var captcha_check = (function(){
	var actual_captcha = Math.floor(Math.random(100)*Math.pow(10, 5));
	return
	function check(guess){
		if(guess != this.actual_captcha){
			console.log("You have written it correctly.");
		} else {
			console.log("You have written it incorrectly.");
		}
	}
})();

//Do not edit below this line.(Sorry i must edit the lines below because of my incompetence)
var bot;
try{
	bot = captcha_check.actual_captcha;
} catch(e){
	bot = "undefined";
}
try{
	captcha_check.check(bot);
} catch(e){
	console.log("You have written it incorrectly.");
}
console.log(bot);
