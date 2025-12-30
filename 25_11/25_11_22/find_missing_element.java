import java.util.*;
class find_missing_element{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(generate(10));
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("missing element is: "+missing(arr));
        ArrayList<Integer> arr1=new ArrayList<>(generate1(10));
        for(int x:arr1){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("missing element is: "+missing(arr1));

    }

    static int missing(ArrayList<Integer> arr){
        ArrayList<Boolean> flags=new ArrayList<Boolean>();
        for(int i=0;i<=arr.size();i++){
            flags.add(false);
        }
        for(int i:arr){
            flags.set(i-1,true);
        }
        for(int i=0;i<=arr.size();i++){
            if(!flags.get(i)){
                return i+1;
            }
        }
        return -1;
    }

    static ArrayList<Integer> generate1(int n){
        Random rand=new Random();
        int rand_int=rand.nextInt(n)+1;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(0);
        }
        ArrayList<Boolean> occupied=new ArrayList<>();
        for(int i=0;i<n;i++){
            occupied.add(false);
        }
        for(int i=1;i<=n;i++){
            int pos=rand.nextInt(n);
            while(occupied.get(pos)){
                pos=rand.nextInt(n);
            }
            if(i!=rand_int){
                arr.set(pos,i);
                occupied.set(pos,true);
            }
        }
        int pos=arr.indexOf(0);
        for(int i=pos;i<arr.size()-1;i++){
            arr.set(i,arr.get(i+1));
        }
        arr.remove(arr.size()-1);
        return arr;
    }

    static ArrayList<Integer> generate(int n){
        Random rand=new Random();
        ArrayList<Integer> arr=new ArrayList<>();
        int rand_int=rand.nextInt(n)+1;
        for(int i=1;i<=n;i++){
            if(i!=rand_int){
                arr.add(i);
            }
        }
        shuffle(arr);
        return arr;
    }

    static void shuffle(ArrayList<Integer> arr){
        int n=arr.size();
        Random rand=new Random();
        for(int i=0;i<n;i++){
            int random_int=rand.nextInt(n);
            int temp=arr.get(random_int);
            arr.set(random_int,arr.get(i));
            arr.set(i,temp);
        }
    }
}
