// Day 4: Arrows
// https://www.hackerrank.com/contests/7days-javascript/challenges/arrows
// created by hendrawd

// examples:
// var digits = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
// var even_digits = digits.filter( num => num % 2 === 0 );
// console.log(even_digits);   // [ 0, 2, 4, 6, 8 ]

// var names = [ "Hacker", "Rank", "Website" ];  
// var names_length = names.map( name => name.length );
// console.log(names_length);  // [ 6, 4, 7 ]

// var employee = {
//     _name : "Vineet",
//     _task : ["test the beta.", "debug the code.", "create challenges."],
//     _printTask() {
//         this._task.forEach( t => console.log(this._name + " has to " + t));
//     }
// };

// employee._printTask();

//traditional function
// var my_function = function(n){
// 	var returnVal = [];
// 	n.forEach(
// 		function(entry){
// 			if(entry % 2 === 0)
// 				returnVal.push(entry-1);	
// 			else
// 				returnVal.push(entry+1);
// 		}
// 		);
// 	return returnVal;
// }

//use arrows inner function
// var my_function = function(n){
// 	var returnVal = [];
// 	n.forEach(
// 		entry => {
// 			if(entry % 2 === 0)
// 				returnVal.push(entry-1);	
// 			else
// 				returnVal.push(entry+1);
// 		}
// 		);
// 	return returnVal;
// }

//simpler solution from forum
var my_function = arr_val => arr_val%2==0 ? arr_val++ : arr_val--;