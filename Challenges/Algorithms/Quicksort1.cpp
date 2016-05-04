//
//  https://www.hackerrank.com/challenges/quicksort1
//
//  Created by Hendra Wijaya Djiono on 12/13/15.
//  Copyright © 2015 Hendra Wijaya Djiono. All rights reserved.
//

#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <bitset>
#include <cstdio>
#include <vector>
#include <cstdlib>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
using namespace std;
void partition(vector <int>  ar) {
    int splitter = ar.at(0);
    vector<int> subAr1;//right values
    vector<int> subAr2;//left values
    for (int i = 1; i<ar.size(); i++) {
        if (ar.at(i) > splitter) {
            subAr1.push_back(ar.at(i));
        }
        else{
            subAr2.push_back(ar.at(i));
        }
    }
    for (int i = 0; i<subAr2.size(); i++) {
        printf("%d ", subAr2.at(i));
    }
    printf("%d ", splitter);
    for (int i = 0; i<subAr1.size(); i++) {
        printf("%d ", subAr1.at(i));
    }
    
}
int main(void) {
    vector <int>  _ar;
    int _ar_size;
    cin >> _ar_size;
    for(int _ar_i=0; _ar_i<_ar_size; _ar_i++) {
        int _ar_tmp;
        cin >> _ar_tmp;
        _ar.push_back(_ar_tmp);
    }
    
    partition(_ar);
    
    return 0;
}