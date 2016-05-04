// Day 6: The Utopian Tree
// https://www.hackerrank.com/contests/7days-javascript/challenges/utopian-tree-7-js-only
// created by hendrawd

process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var t = parseInt(readLine());
    for(var a0 = 0; a0 < t; a0++){
        var n = parseInt(readLine());
        var h = 1;
        for(var i = 0; i < n; i++){
            if(i%2==1){
                h = phase1(h);
            }
            else{
                h = phase2(h);
            }
        }
        console.log(h);
    }

}

function phase1(current){
    return current+1;
}

function phase2(current){
    return current*2;
}