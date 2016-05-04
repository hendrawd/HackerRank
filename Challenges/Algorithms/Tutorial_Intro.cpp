#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/challenges/tutorial-intro
int main() {
    int i, n;
    cin>>i>>n;
    for(int a = 0; a < n; a++){
        int b;
        cin>>b;
        if(b == i){
            cout<<a;
            break;
        }
    }
    return 0;
}