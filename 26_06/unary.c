#include <stdio.h>

void main(){
    int a=5;
    // unary arithmetic operator
    printf("current value of a is %d \n",a);
    printf("increment first, then print it: %d \n",++a); //pre increment operator

    printf("current value of a is %d \n",a);
    printf("first print,then increment: %d \n",a++); //post increment operator

    printf("current value of a is %d \n",a);
    printf("decrement first, then print it: %d \n",--a); //pre decrement operator

    printf("current value of a is %d \n",a);
    printf("first print,then decrement: %d \n",a++); //post decrement operator
    
    printf("current value of a is %d \n",a);
}
