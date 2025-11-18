import java.util.*;
class move_zeroes_to_end{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(List.of(5,0,2,0,3,0));
        move(arr);
        System.out.print("after moving: ");
        int c=0;
        System.out.print("[");
        for(int x:arr){
            System.out.print(x);
            if(c<arr.size()-1){
                System.out.print(",");
            }
            c++;
        }
        System.out.println("]");
    }

    static void move(ArrayList<Integer> arr){
        System.out.print("before moving: ");
        int c=0;
        System.out.print("[");
        for(int x:arr){
            System.out.print(x);
            if(c<arr.size()-1){
                System.out.print(",");
            }
            c++;
        }
        System.out.println("]");
        int counter=0;
        for(int i=0;i<end(arr);i++){
            if(arr.get(i)==0){
                int old_end=end(arr);
                swap(arr,i,end(arr));
                counter++;
                System.out.print("after "+counter+" iteration: ");
                System.out.print("swapped "+(i+1)+" and "+(old_end+1)+" elements ");
                int d=0;
                System.out.print("[");
                for(int x:arr){
                    System.out.print(x);
                    if(d<arr.size()-1){
                        System.out.print(",");
                    }
                    d++;
                }
                
                System.out.println("]");
            }
            
            
        }
    }

    static int end(ArrayList<Integer> arr){
        int end=arr.size()-1;
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)==0){
                end--;
            }
            else{
                break;
            }
        }
        return end;
    }

    static void swap(ArrayList<Integer> arr,int a,int b){
        int temp=arr.get(b);
        arr.set(b,arr.get(a));
        arr.set(a,temp);
    }
}

