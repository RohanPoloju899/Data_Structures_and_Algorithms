
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


#include <stdio.h>
int main()
{
    long long prev_term=5,curr_term=7,temp=0;
    printf("%d %d ",prev_term,curr_term);
    int n=50;
    for(int i=3;i<=n;i++){
        temp=prev_term+curr_term;
        prev_term=curr_term;
        curr_term=temp;
        printf("%lld ",temp);
    }
    return 0;
}


