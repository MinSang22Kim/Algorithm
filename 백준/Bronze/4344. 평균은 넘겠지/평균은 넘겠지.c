#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int num, stu, cnt, sum;
    double avg;
    scanf("%d", &num);
    for(int i=0; i<num; i++){
        sum=0;
        avg=0.0;
        scanf("%d", &stu);
        int score[stu];
        for(int j=0; j<stu; j++){
            scanf("%d", &score[j]);
            sum+=score[j];
        }
        avg=(double)sum/stu;
        cnt=0;
        for(int j=0; j<stu; j++){
            if(score[j]>avg)
                cnt++;
        }
        printf("%.3f%%\n", cnt*100.0/stu);
    }
    return 0;
}