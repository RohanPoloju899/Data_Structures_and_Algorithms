#include <iostream>
using namespace std;

/*void all_multiples(int m,int n,int step){
    int multiple=n*step;
    if((abs(multiple))<abs(m)){
        cout<<multiple<<" ";
    }
    else{
        cout<<multiple<<" ";
        return;
    }
    if(n<m){
        step++;
    }
    else{
        step--;
    }
    return all_multiples(m,n,step);
}*/

void all_multiples1(int m,int n){
    int divisor=m/n;
    if(n<=m){
        for(int i=1;i<divisor;i++){
            cout<<n*i<<" ";
        }
    }
    else{
        for(int i=1;i<divisor;i--){
            cout<<n*i<<" ";
        }
    }
}

int main(){
    int m=-17;
    int n=4;
    int step=1;
    //all_multiples(m,n,step);
    all_multiples1(m,n);
    return 0;
}
