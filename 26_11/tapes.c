
#include <stdio.h>

int main()
{
    int a[4]={1,10,45,70};
    int sum=0,sum_to_next=0;
    for(int i=0;i<4;i++){
        sum_to_next+=a[i];
        sum+=sum_to_next;
    }    
    printf("%d",sum);
    return 0;
}
