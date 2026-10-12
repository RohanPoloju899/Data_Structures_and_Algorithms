#include <stdio.h>
int sum(int a,int b);
void main(){
    int a=10,b=20;
    printf("Sum of %d and %d is %d",a,b,sum(a,b));
}

int sum(int a,int b){
    return a+b;
}
