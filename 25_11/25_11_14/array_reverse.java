import java.util.*;
class array_reverse{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(List.of(1,2,3,4));
        for(int x:reverse(arr)){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:reverse1(arr)){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            res.add(arr.get(i));
        }
        return res;
    }

    static ArrayList<Integer> reverse1(ArrayList<Integer> arr){
        int size=arr.size();
        for(int i=0;i<=(size/2)-1;i++){
            swap(arr,i,size-1-i);
        }
        return arr;
    }

    static void swap(ArrayList<Integer> arr,int a,int b){
        int temp=arr.get(b);
        arr.set(b,arr.get(a));
        arr.set(a,temp);
    }
}
