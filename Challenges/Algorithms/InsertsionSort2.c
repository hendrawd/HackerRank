#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>
// https://www.hackerrank.com/challenges/insertionsort2
void insertionSort(int ar_size, int *  ar) {
    int temp;
    for(int i = 0; i < ar_size-1; i++){
        if(ar[i] > ar[i+1]){
            temp = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = temp;
        }
        for(int curr = i; curr > 0; curr--){
            if(ar[curr-1] > ar[curr]){
                temp = ar[curr];
                ar[curr] = ar[curr-1];
                ar[curr-1] = temp;
            }
            else{
                break;
            }
        }
        for(int j = 0; j < ar_size; j++){
            printf("%d ",ar[j]);
        }
        printf("\n");
    }

}
int main(void) {

     int _ar_size;
     scanf("%d", &_ar_size);
     int _ar[_ar_size], _ar_i;
     for(_ar_i = 0; _ar_i < _ar_size; _ar_i++) { 
        scanf("%d", &_ar[_ar_i]); 
     }

     insertionSort(_ar_size, _ar);

     return 0;
}