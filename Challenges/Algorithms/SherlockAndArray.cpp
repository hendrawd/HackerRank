//
//  SherlockAndArray.cpp
//  https://www.hackerrank.com/challenges/sherlock-and-array
//
//  Created by Hendra Wijaya Djiono on 12/14/15.
//  Copyright © 2015 Hendra Wijaya Djiono. All rights reserved.
//

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t-- > 0){
        int n;
        cin>>n;
        int a[n];
        int sumLeft = 0;
        for(int i = 0; i < n; i++){
            cin>>a[i];
            sumLeft += a[i];
        }
        if(n!=1){
            if(n != 2){
                int sumRight = 0;
                sumLeft = sumLeft - a[n-1];
                for(int cur = n-2; cur > 0; cur--){
                    sumRight = sumRight + a[cur+1];
                    sumLeft = sumLeft - a[cur];
                    if(sumLeft == sumRight){
                        cout << "YES\n";
                        break;
                    }
                    if(cur==1){
                        cout << "NO\n";
                    }
                }
            }
            else{
                if(sumLeft - a[n-1] == a[n-1]){
                    cout << "YES\n";
                }
                else{
                    cout << "NO\n";
                }
            }
        }
        else{
            cout << "YES\n";
        }
    }
    return 0;
}
