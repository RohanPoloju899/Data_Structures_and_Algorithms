#include <stdio.h>

int main(){
    int a[]={10,20,30};
    int *p=&a[0];
    printf("%d",*(p+1));

    int *q=&a[0];
    int *r=&a[2];
    printf("\n%d",r>p);

    int *p1=NULL;

    if(p1==NULL){
        printf("\ntrue");
        
    }
    printf("\n%d",p1);
}
