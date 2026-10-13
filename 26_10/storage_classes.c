#include <stdio.h>
void demo();
void main(){
    demo();
}

void demo(){
    auto int a=1;
    register int b=2;
    static int c=3;
    extern int d;
    printf("a: %d \nb: %d \nc: %d \nd: %d",a,b,c,d);
}

int d=10;
