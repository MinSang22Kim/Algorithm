#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void){
    int n;
    scanf("%d", &n);
    int w[50], h[50];
    for(int i=0; i<n; i++)
        scanf("%d %d", &w[i], &h[i]);
    for(int i=0; i<n; i++){
        int cnt=1;
        for(int j=0; j<n; j++){
            if(w[i]<w[j]&&h[i]<h[j])
                cnt++;
        }
        printf("%d ", cnt);
    }
    puts("");
    return 0;
}