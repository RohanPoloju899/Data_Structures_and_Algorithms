#include <stdio.h>

int main(){
    int a=10;
    int *p=&a;
    printf("%p",p);
    printf("\n%d",*p);
    printf("\n%p",sizeof(&a));
    return 0;
}

