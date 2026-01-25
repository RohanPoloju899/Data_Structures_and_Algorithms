class count_transitions{
    public static void main(String[] args){
        String a="100110010";
        System.out.println(count_transitions(a));
    }

    static int count_transitions(String a){
        int result=0;
        for(int i=0;i<a.length()-1;i++){
            if(a.charAt(i)!=a.charAt(i+1)){
                result++;
            }
        }
        return result;
    }
}
