#include <stdio.h>
#include <string.h>

int main(){
    char name[13];
    fgets(name,sizeof(name),stdin);
    printf("%s",name);

    char *name1="rohan poloju";
    //name1[0]='q';
    printf("%s",name1);
    return 0;
};
