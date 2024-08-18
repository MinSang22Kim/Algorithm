#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n, a, b, arr1[n], arr2[n], sum;
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        scanf("%d %d", &a, &b);
        arr1[i]=a;
        arr2[i]=b;
    }
    for(int i=0; i<n; i++){
        sum = arr1[i] + arr2[i];
        printf("%d\n", sum);
    }
    return 0;
}