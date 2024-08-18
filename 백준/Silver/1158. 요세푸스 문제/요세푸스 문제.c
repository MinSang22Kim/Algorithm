#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
typedef struct node{
    int data;
    struct node *next;
} Node;

int main(void){
    int n, k;
    scanf("%d %d", &n, &k);
    
    Node *head = NULL;
    Node *tail = NULL;
    
    for(int i=1; i<=n; i++){
        Node *node=(Node*)malloc(sizeof(Node));
        node->data = i;
        node->next = NULL;
        
        if(head == NULL){
            head = node;
            tail = node;
        }
        else{
            tail->next = node;
            tail = node;
        }
    }
    tail->next=head; // 원형리스트 만들려고
    
    Node* cur = head;
    Node* before = tail;
        printf("<");
        while(n>1){
            for (int i=0; i<k-1; i++){
                before = cur;
                cur = cur->next;
            }
            // k번째 사람 제거
            before->next = cur->next;
            printf("%d, ", cur->data);
            if(n!=1)
                free(cur);
            cur = before->next;
            n--;
        }
        // 마지막으로 남은 사람 출력
        printf("%d>", cur->data);
    return 0;
}