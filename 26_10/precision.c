#include <stdio.h>

typedef unsigned short u_short;

enum Day{
    MON='c',TUE,WED
};

union Data{
    int a;
    float b;
};

struct Student{
    int id;
    char name[10];
    double marks;
};

void main(){
    struct Student r={1,"rohan",85.594697845879};
    printf("%d %.15f", r.id,r.marks);

    union Data d;

    d.a=10;
    d.b=10.45;
    printf("\n%d & %f",d.a,d.b);

    enum Day e=TUE;
    printf("\n%d",e);

    u_short us=54;
    printf("\n%hu",us);
}



