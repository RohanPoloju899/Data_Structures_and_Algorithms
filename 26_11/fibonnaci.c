
#include <stdio.h>
int fib(int n){
    int first_term=1,second_term=1,temp;
    if(n==1||n==2){
        return 1;
    }
    for(int i=3;i<=n;i++){
        temp=first_term+second_term;
        first_term=second_term;
        second_term=temp;
    }
    return temp;
}
int main()
{
    printf("%d ",fib(5));
    return 0;
}

