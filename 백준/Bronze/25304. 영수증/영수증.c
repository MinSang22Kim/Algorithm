#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int sum=0;
    int price, num, allsum, allnum;
    scanf("%d", &allsum);
    scanf("%d", &allnum);
    for(int i=0; i<allnum; i++){
        scanf("%d %d", &price, &num);
        sum+=(price*num);
    }
    if(sum==allsum)
        printf("Yes\n");
    else
        printf("No\n");
    return 0;
}