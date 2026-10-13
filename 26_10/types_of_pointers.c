#include <stdlib.h>
#include <stdio.h>

int main(){
    int *p=NULL;
    int a=10;
    void *v=&a;
    int *w;
    int *d=malloc(sizeof(int));
    free(d);
    printf("%p %p %p %p",p,v,w,d);
}
