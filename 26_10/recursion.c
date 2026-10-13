#include <stdio.h>

void rec(int n);

int main(){
    int a=3;
    rec(a);
    return 0;
}

void rec(int n){
    if(n==6){
        return;
    }
    printf("recursion level: %d\n",n);
    rec(n+1);
}
