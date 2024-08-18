#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n;
    char arr[1000];
    scanf("%s", arr);
    scanf("%d", &n);
    printf("%c\n", arr[n-1]);
    return 0;
}