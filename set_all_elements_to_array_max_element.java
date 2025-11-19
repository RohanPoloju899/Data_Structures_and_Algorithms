import java.util.*;

class set_all_elements_to_array_max_element {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(List.of(4,7,19,16));
        int k=3;
        System.out.println(check(arr,k));
        System.out.println(number_of_operations(arr,k));
        steps(arr,k);
    }

    static void steps(ArrayList<Integer> arr,int k){
        int counter=0;
        if(check(arr,k)){
            for(int i=0;i<arr.size();i++){
                int x=arr.get(i);
                if(x!=max(arr)){
                    int new_value=x;
                    int steps=(max(arr)-x)/k;
                    for(int j=1;j<=steps;j++){
                        counter++;
                        new_value+=k;
                        arr.set(i,new_value);
                        System.out.print("after "+counter+" iteration: ");
                        System.out.print("[");
                        for(int a=0;a<arr.size();a++){
                            System.out.print(arr.get(a));
                            if(a!=(arr.size()-1)){
                                System.out.print(",");
                            }
                        }
                        System.out.print("]");
                        System.out.println();
                    }
                }
            }
        }
    } 


    static int number_of_operations(ArrayList<Integer> arr,int k){
        int counter=0;
        if(check(arr,k)){
            for(int x:arr){
                if(x!=max(arr)){
                    counter+=(max(arr)-x)/k;
                }
            }
        }
        return counter;
    }

    static boolean check(ArrayList<Integer> arr,int k){
        boolean flag=true; 
        for(int x:arr){
            if(x!=max(arr)){
                if((max(arr)-x)%k==0){
                    continue;
                }
                else{
                    flag=false;
                }
            }
        }
        return flag;
    }

    static int max(ArrayList<Integer> arr){
        int max=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        return max;
    }
}
