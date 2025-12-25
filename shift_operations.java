class shift_operations{
    public static void main(String[] args){
        System.out.println(circular_shift_left("101101",3));
    }

    static String circular_shift_left(String a,int n){
        for(int i=1;i<=n;i++){
            a=a.substring(1)+a.charAt(0);
        }
        return a;
    }


    static String circular_shift_right(String a,int n){
        for(int i=1;i<=n;i++){
            a=a.charAt(a.length()-1)+a.substring(0,a.length()-1);
        }
        return a;
    }

    static String arithmetic_shift_right(String a,int n){
        return a.charAt(0)+shift_right(a.substring(1), n);
    }

    static String arithmetic_shift_left(String a,int n){
        return a.charAt(0)+shift_left(a.substring(1), n);
    }

    static String shift_left(String a,int n){
        String temp="";
        if(n<a.length()){
            temp=a.substring(0+n,a.length());
        }
        else{
            return "0".repeat(a.length());
        }
        return temp+"0".repeat(n);
    }

    static String shift_right(String a,int n){
        String temp="";
        if(n<a.length()){
            temp=a.substring(0,a.length()-n);
        }
        else{
            return "0".repeat(a.length());
        }
        for(int i=0;i<n;i++){
            temp="0"+temp;
        }
        return temp;
    }
}
