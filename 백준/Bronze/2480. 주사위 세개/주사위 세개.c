#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int d1, d2, d3, max=0, same;
    scanf("%d %d %d", &d1, &d2, &d3);
    if(d1==d2&&d2==d3&&d1==d3){
        printf("%d\n", 10000+d1*1000);
    }
    else if(d1==d2||d1==d3||d2==d3){
        if(d1==d2||d1==d3)
            same=d1;
        else
            same=d2;
        printf("%d\n", 1000+same*100);
    }
    else{
        if(d1>d2&&d1>d3)
            max=d1;
        else if(d2>d1&&d2>d3)
            max=d2;
        else if(d3>d1&&d3>d2)
            max=d3;
        printf("%d\n", max*100);
    }
    return 0;
}