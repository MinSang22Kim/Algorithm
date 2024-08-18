#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int num, x, y, cnt=0;
    int arr[101][101]={0};
    scanf("%d\n", &num);
    for(int i=0; i<num; i++){
        scanf("%d %d", &x, &y);
        for(int a=x; a<x+10; a++){
            for(int b=y; b<y+10; b++){
                arr[a][b]=1;
            }
        }
    }
    for(int i=0; i<=100; i++){
        for(int j=0; j<=100; j++){
            if(arr[i][j]==1)
                cnt++;
        }
    }
    printf("%d\n", cnt);
    return 0;
}