#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(void){
    srand((unsigned int)time(NULL));
    printf("%d\n", rand()%9+1);
    return 0;
}