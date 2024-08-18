#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n1, n2, c1, c2, c3;
    scanf("%d", &n1);
    scanf("%d", &n2);
    c1=n1*(n2%10);
    c2=n1*((n2%100)/10);
    c3=n1*(n2/100);
    printf("%d\n", c1);
    printf("%d\n", c2);
    printf("%d\n", c3);
    printf("%d\n", c1+c2*10+c3*100);
    return 0;
}