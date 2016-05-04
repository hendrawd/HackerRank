#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

//https://www.hackerrank.com/challenges/runningtime
void insertionSort(int ar_size, int *  ar) {
    int temp;
    int trackNumber = 0;
    for(int i = 0; i < ar_size-1; i++){
        if(ar[i] > ar[i+1]){
            temp = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = temp;
            trackNumber++;
        }
        for(int curr = i; curr > 0; curr--){
            if(ar[curr-1] > ar[curr]){
                temp = ar[curr];
                ar[curr] = ar[curr-1];
                ar[curr-1] = temp;
                trackNumber++;
            }
            else{
                break;
            }
        }
    }
    printf("%d", trackNumber);
}
int main(void) {
     int _ar_size;
     int n = scanf("%d", &_ar_size);
     if(n>0){
         int _ar[_ar_size], _ar_i;
         for(_ar_i = 0; _ar_i < _ar_size; _ar_i++) { 
            int n_row = scanf("%d", &_ar[_ar_i]); 
            if(n_row==0){
                printf("Can't read array with index %d", _ar_i);
                return 0;
            }
         }
         insertionSort(_ar_size, _ar);
     }
     else{
         printf("Can't read array size");
     }
     return 0;
}
