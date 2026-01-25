class nth_unicode_character{
    public static void main(String[] args){
        int i=87;
        String hex=Integer.toHexString(i).toUpperCase();
        System.out.println(i+prefix(i)+" Unicode character is "+unicode(i)+"(unicode id:U+"+"0".repeat(zeros(hex))+hex+")");
    }
     
    static char unicode(int i){
        return (char)i;
    }

    static int zeros(String hex){
        return 4-hex.length();
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
