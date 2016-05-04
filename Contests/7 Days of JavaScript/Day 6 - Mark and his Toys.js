// Day 6: Mark and his Toys
// https://www.hackerrank.com/contests/7days-javascript/challenges/mark-and-toys-2-js-only
// created by hendrawd

function processData(input) {
    var lines = input.split('\n');
    var line1 = lines[0].split(' ');
    var hargaLength = line1[0];
    var duit = line1[1];
    var line2 = lines[1].split(' ');
    var i = 0;
    var sum = 0;
    line2 = line2.sort(sortNumber);
    while(sum <= duit){
        sum = parseInt(line2[i]) + sum;
        i++;
    }
    console.log(i-1);
} 

function sortNumber(a,b){
    return a-b;
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
