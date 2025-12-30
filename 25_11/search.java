import java.util.*;
class search{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(List.of(5,4,7,8,9,6,3,2,1));
        int key=3;
        System.out.println(key+" is at "+binary_search(arr,key)+" position");
        System.out.println(key+" is at "+linear_search(arr,key)+" position");
    }

    static int linear_search(ArrayList<Integer> arr,int key){
        for(int x:arr){
            if(x==key){
                return arr.indexOf(x)+1;
            }
        }
        return -1;
    }

    static int binary_search(ArrayList<Integer> arr,int key){
        arr.sort(null);
        int start=0;
        int end=arr.size()-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr.get(mid)==key){
                return mid+1;
            }
            else if(key<arr.get(mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
