#include <stdio.h>

int push=0,pop=0;

void rec(int n){
    printf("push count is %d \n",++push);
    if(n>1){
        rec(n-1);
        rec(n-1);
    }
    printf("pop count is %d \n",++pop);
}

int main(){
    rec(3);
    return 0;
}
