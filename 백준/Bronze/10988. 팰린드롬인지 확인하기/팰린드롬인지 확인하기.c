//
//  boj10988.c
//  ccc
//
//  Created by 김민상 on 2023/06/19.
//

#include <stdio.h>
#include <string.h>

int check(char* word){
    int num = 1;
    unsigned long sz = strlen(word);
    unsigned long mid = sz / 2 ;
        for(int i = 0; i <= sz-1; i++){
            if(word[i] != word[sz-1-i]){
                num = 0;
                break;
            }
            else
                continue;
        }
    return num;
}
int main(void){
    int num;
    char word[100];
    scanf("%s", word);
    num = check(word);
    printf("%d\n", num);
    return 0;
}
