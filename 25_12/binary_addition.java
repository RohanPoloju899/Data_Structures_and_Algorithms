import java.util.*;
class rohan32{
    static int max_digits;
    static String[] arr1;
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(List.of(5,37,4));
        max_digits=max_num_digit(arr);
        arr1=new String[arr.size()];
        System.out.print("Sum of: ");
        for(int i=0;i<arr.size();i++){
            String temp=binary(arr.get(i));
            System.out.print(arr.get(i)+"(");
            System.out.print(temp);
            System.out.print(")");
            if(i!=arr.size()-1){
                System.out.print(" and ");
            }
            else{
                System.out.print(" ");
            }
            arr1[i]=temp;
        }
        String sum=adder(arr1);
        System.out.println("is "+decimal(sum)+"("+sum+")");
        
    }

    static String adder(String[] arr1){
        String sum=arr1[0];
        for(int i=1;i<arr1.length;i++){
            sum=binary_adder(arr1[i],sum);
        }
        return sum;
    }

    static String binary_adder(String a,String b){
        String res="";
        while(a.length()<b.length()){
            a="0"+a;
        }
        while(b.length()<a.length()){
            b="0"+b;
        }
        int a_length=a.length();
        int carry=0;
        for(int i=a_length-1;i>=0;i--){
            int n1=a.charAt(i)-'0';
            int n2=b.charAt(i)-'0';
            int sum=n1^n2;
            int sum1=sum^carry;
            carry=(n1&n2)|(carry&(n1^n2));
            res=sum1+res;
            
        }
        if(carry==1){
            res="1"+res;
        }
        return res;

    }

    static int decimal(String sum){
        int res=0;
        for(int i=sum.length()-1;i>=0;i--){
            if(sum.charAt(i)=='1'){
                res+=1<<(sum.length() - 1 - i);
            }

        }
        return res;
    }
    

    static String binary(int n){
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n/=2;
            
        }
        while(binary.length()<max_digits){
                binary="0"+binary;
        }
        
        return binary;
    }

    static int max_num_digit(ArrayList<Integer> arr){
        int max=arr.get(0);
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return Integer.toBinaryString(max).length();
    }
}
