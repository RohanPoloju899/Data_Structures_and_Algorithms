#include <iostream>
#include <cstdlib>
using namespace std;

int nearest(int m,int n){
    cout<<"given number: "<<m<<endl;
    cout<<"given divisor: "<<n<<endl;
    int divisor=m/n;
    int left,right;
    if(m>=0){
        left=(n*divisor);
        right=(n*(divisor+1));
    }
    else{
        left=(n*(divisor-1));
        right=(n*divisor);
    }
    cout<<"left: "<<left<<endl;
    cout<<"right: "<<right<<endl;
    cout<<left<<"->"<<m<<"->"<<right<<endl;
    int left_distance=abs(left-m);
    int right_distance=abs(right-m);
    cout<<"left_distance: "<<left_distance<<endl;
    cout<<"right_distance: "<<right_distance<<endl;
    if(left_distance==right_distance){
        if(m<0){
            return right;
        }
        else{
            return left;
        }
    }
    else{
        return (left_distance<right_distance?left:right);
    }
}

int main(){
    int m=-3;
    int n=4;
    int nearest_number=nearest(m,n);
    cout<<"the nearest multiple of "<<n<<" to "<<m<<" is: "<<nearest_number;
    return 0;
}
