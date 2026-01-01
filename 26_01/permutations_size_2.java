//this prints permutations and combinations of size 2
import java.util.*;

class permutations_size_2{
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<>(List.of(1,2,3));
        System.out.println(permutations(arr));
        System.out.println(combinations(arr));
    }

    static List<List<Integer>> permutations(List<Integer> arr){
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            
            for(int j=0;j<arr.size();j++){
                List<Integer> row=new ArrayList<>();
                if(i==j){
                    continue;
                }
                row.add(arr.get(i));
                row.add(arr.get(j));
                result.add(row);
                
            }
        }
        return result;
    }

    static List<List<Integer>> combinations(List<Integer> arr){
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                List<Integer> pair=new ArrayList<>();
                pair.add(arr.get(i));
                pair.add(arr.get(j));
                result.add(pair);
            }
        }
        return result;
    }
    
}
