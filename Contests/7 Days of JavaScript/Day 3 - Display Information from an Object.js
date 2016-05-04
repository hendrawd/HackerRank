// Day 3: Display Information from an Object
// https://www.hackerrank.com/contests/7days-javascript/challenges/display-infromation-from-an-object
// created by hendrawd

function displayInformation() {
     // var library is defined, use it to print the information
     for (var i = 0; i < library.length; i++) {
        if(library[i].readingStatus)
            console.log("Already read '"+library[i].title+"' by "+library[i].author+".");
        else
            console.log("You still need to read '"+library[i].title+"' by "+library[i].author+".");
     }
} 

// tail starts here
var library = [ 
    {
        title: 'Bill Gates',
        author: 'The Road Ahead',
        readingStatus: true
    },
    {
        title: 'Steve Jobs',
        author: 'Walter Isaacson',
        readingStatus: true
    },
    {
        title: 'Mockingjay: The Final Book of The Hunger Games',
        author: 'Suzanne Collins',
        readingStatus: false
    }
];

displayInformation();
