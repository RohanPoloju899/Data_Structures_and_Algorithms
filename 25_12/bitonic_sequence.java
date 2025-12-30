
import java.util.*;

class bitonic_sequence{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(List.of(1,3,5,8,-3));
        System.out.println(bitonic(arr));
    }

    static int bitonic(ArrayList<Integer> arr){
        int low=0;
        int high=arr.size()-1;
        while(low<high){
            int mid=(low+high)/2;

            if(arr.get(mid)<=arr.get(mid+1)){
                low=mid+1;
            }
            else {
                high=mid;
            }
        }
        return arr.get(low);
    }
}
