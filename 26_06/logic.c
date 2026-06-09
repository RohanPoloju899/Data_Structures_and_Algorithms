#include <stdio.h>
#include <stdbool.h>

void main(){
    // true represented as 1, false represented as 0
    bool a=true; 
    bool b=false;
    printf("and of %b and %b is: %b \n",a,b,a&&b); //logical and 
    printf("or of %b and %b is: %b \n",a,b,a||b); //logical or
    printf("complement of %b is: %b \n",a,!a); //logical complement
}
