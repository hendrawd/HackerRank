//
//  IceCreamParlor.cpp
//  https://www.hackerrank.com/challenges/icecream-parlor
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
    while (t-- > 0) {
        int m, n;
        cin>>m>>n;
        int ar[n];
        for (int i = 0; i < n; i++) {
            cin>>ar[i];
        }
        bool breakAll = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m == ar[i]+ar[j]) {
                    printf("%d %d\n", i+1, j+1);
                    breakAll = true;
                    break;
                }
            }
            if(breakAll){
                break;
            }
        }
    }
    return 0;
}