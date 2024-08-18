#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n, min, max;
    scanf("%d", &n);
    int arr[n];
    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    min=max=arr[0];
    for(int i=0; i<n; i++){
        if(arr[i]<=min)
            min=arr[i];
        if(arr[i]>=max)
            max=arr[i];
    }
    printf("%d %d\n", min, max);
    return 0;
}