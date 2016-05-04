//
//  OperatorOverloading.cpp
//  https://www.hackerrank.com/challenges/operator-overloading
//
//  Created by hendrawd on 12/14/15.
//  Copyright © 2015 hendrawd. All rights reserved.
//

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Matrix{
public:
    vector<vector<int>> a;
};

Matrix operator+(const Matrix &a, const Matrix &b){
    Matrix output;
//    cout<<"harusnya masuk sini\n";
//    printf("a.a.size() is %lu\n", a.a.size());
//    printf("b.a.size() is %lu\n", b.a.size());
//    cout<<"harusnya masuk sini\n";
//    int counter = 1;
    for (int i = 0; i < a.a.size(); i++) {
        vector<int> c;
        for (int j = 0; j < a.a[i].size(); j++) {
//            printf("a.a[i].size() is %lu\n", a.a[i].size());
//            printf("b.a[i].size() is %lu\n", b.a[i].size());
//            printf("counter dijalanin sebanyak = %dx\n", counter);
            c.push_back(a.a[i][j]+b.a[i][j]);
        }
        output.a.push_back(c);
    }
    return output;
}

int main () {
    int cases,k;
    cin >> cases;
    for(k=0;k<cases;k++) {
        Matrix x;
        Matrix y;
        Matrix result;
        int n,m,i,j;
        cin >> n >> m;
        for(i=0;i<n;i++) {
            vector<int> b;
            int num;
            for(j=0;j<m;j++) {
                cin >> num;
                b.push_back(num);
            }
            x.a.push_back(b);
        }
        for(i=0;i<n;i++) {
            vector<int> b;
            int num;
            for(j=0;j<m;j++) {
                cin >> num;
                b.push_back(num);
            }
            y.a.push_back(b);
        }
        result = x+y;
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                cout << result.a[i][j] << " ";
            }
            cout << endl;
        }
    }  
    return 0;
}