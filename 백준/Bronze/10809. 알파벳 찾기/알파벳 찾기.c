#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int main(void){
    char word[100];
    scanf("%s", word);
    for(int i=97; i<123; i++){
        int n=-1;
        for(int j=0; j<strlen(word); j++){
            if(word[j]==i){
                n=j;
                break; //같은 단어 j값 올라가는 거 방지
            }
        }
        printf("%d ", n);
    }
    return 0;
}