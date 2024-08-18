#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int x,n, num;
    scanf("%d %d", &n, &x);
    int arr[n];
    for(int i=0; i<n; i++){
        scanf("%d", &num);
        arr[i]=num;
    }
    for(int i=0; i<n; i++){
        if(arr[i]<x)
            printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}