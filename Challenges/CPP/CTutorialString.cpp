//https://www.hackerrank.com/challenges/c-tutorial-strings
#include <iostream>
#include <string>
using namespace std;

int main() {
    string s1, s2;
    cin>>s1>>s2;
    
    //print the length of each string
    cout<<s1.size();
    cout<<" ";
    cout<<s2.size();
    cout<<endl;
    
    //print concat of string1 and string2
    cout<<s1+s2;
    cout<<endl;
    
    //print string1 and string2 with swapped value of first letter
    char temp;
    temp = s1[0];
    s1[0] = s2[0];
    s2[0] = temp;
    cout<<s1;
    cout<<" ";
    cout<<s2;
    
    return 0;
}
