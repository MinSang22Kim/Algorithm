#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n, cnt[10001]={0};
    scanf("%d", &n);
    for(int i=0; i<10001; i++)
        cnt[i]=0;
    for(int num, i=0; i<n; i++){
        scanf("%d", &num);
        cnt[num]++;
    }
    for(int i=0; i<10001; i++)
        for(int j=0; j<cnt[i]; j++)
        printf("%d\n", i);
    return 0;
}