class nth_alphabet{
    public static void main(String[] args){
        int i=3;
        pair p=get_pair(i);
        System.out.println(i+prefix(i)+" alphabet is "+p.c());
    }
    
    record pair(int n,char c){
        
    }
    
    static pair get_pair(int i){
        return new pair(i,(char)('a'+i-1));
    }
    
    static String prefix(int num) {
		int rem = num % 10;
		if(num == 11 || num == 12 || num == 13 || rem == 0 || rem == 4 || rem == 5 || rem == 6 || rem == 7 || rem == 8 || rem == 9 ){
			return "th";
		}
		else if (num % 10 == 1){
			return "st";
		}
		else if (num % 10 == 2){
			return "nd";
		}
		else {
			return "rd";
		}
	}
}
