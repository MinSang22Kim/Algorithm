#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n, num, target, count=0;
    scanf("%d", &n);
    int arr[n];
    for(int i=0; i<n; i++){
        scanf("%d ", &num);
        arr[i]=num;
    }
    scanf("%d", &target);
    for(int i=0; i<n; i++){
        if(arr[i]==target)
            count++;
        if(i==n-1)
            printf("%d\n", count);
    }
    return 0;
}