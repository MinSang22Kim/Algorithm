#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n;
    scanf("%d", &n);
    for(int i=n; i>0; i--){
        for(int j=i; j>0; j--){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}