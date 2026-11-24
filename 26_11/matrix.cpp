#include <iostream>
#include <vector>
using namespace std;

int main(){
    int arr[5][2][2];
    int number_of_matrix=sizeof(arr)/sizeof(arr[0]);
    int row=sizeof(arr[0])/sizeof(arr[0][0]);
    int coloumn=sizeof(arr[0][0])/sizeof(arr[0][0][0]);
    int counter=1;
    for(int i=0;i<number_of_matrix;i++){
        for(int j=0;j<row;j++){
            for(int k=0;k<coloumn;k++){
                arr[i][j][k]=counter;
                counter++;
            }
        }
    }
    for(int i=0;i<number_of_matrix;i++){
        cout<<(i+1)<<" matrix:"<<endl;
        for(int j=0;j<row;j++){
            for(int k=0;k<coloumn;k++){
                cout<<arr[i][j][k]<<" ";
            }
            cout<<endl;
        }
    }
    cout<<"elements in each matrix: "<<sizeof(arr[0])/sizeof(arr[0][0][0])<<endl;
    cout<<"total number of matrices: "<<sizeof(arr)/sizeof(arr[0])<<endl;
    cout<<"total number of elements: "<<sizeof(arr)/sizeof(arr[0][0][0]);
    return 0;
}
