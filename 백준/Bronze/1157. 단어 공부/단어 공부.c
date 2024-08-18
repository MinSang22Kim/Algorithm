#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main(void){
    int max=0;
    int abc[26]={0};
    char word[1000000];
    scanf("%s", word);
    for(int i=0; word[i]!='\0'; i++){
        if(word[i]>='A'&&word[i]<='Z')
            abc[word[i]-'A']++; //몇번째 알파벳인지 넣어줌 대문자ver
        else
            abc[word[i]-'a']++; //몇번째 알파벳인지 넣어줌 소문자ver
    }
    char c=0;
    for(int i=0; i<26; i++){
        if(max<abc[i]){
            max=abc[i];
            c=i+'A'; // 많이 발생한 알파벳을 대문자로 저장
        } // 개수를 max에 넣음
    } //abc[0]~abc[26]해서 각 알파벳 대응 후 최대 구함
    int count=0;
    for(int i=0; i<26; i++)
        if(max==abc[i])
            count++;
    if(count==1) //최댓값을 가지는 알파벳이 유일
        printf("%c\n", c);
    else
        printf("?\n");
    return 0;
}