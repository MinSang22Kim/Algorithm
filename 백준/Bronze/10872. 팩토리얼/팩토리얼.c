#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int result;
int factorial(int i){
    if(i!=0){
        result=i*factorial(i-1);
        return result;
    }
    else{
        result=1;
        return result;
    }
}
int main(void){
    int n;
    scanf("%d", &n);
    factorial(n);
    printf("%d\n", result);
    return 0;
}