#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n, m, sum;
    scanf("%d %d", &n, &m);
    int arr1[n][m], arr2[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            scanf("%d", &arr1[i][j]);
        }
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            scanf("%d", &arr2[i][j]);
            ;
        }
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            sum=arr1[i][j]+arr2[i][j];
            printf("%d ", sum);
        }
        printf("\n");
    }
    return 0;
}