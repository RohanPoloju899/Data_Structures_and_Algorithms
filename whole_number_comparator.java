/* 2- indicates first number is greater than second number
   1- indicates both first and second number are equal
   0- indicates first number is lesser than second number */
class whole_number_comparator{
    public static void main(String[] args){
        System.out.println(compare("223","224"));
        //System.out.println(compare("0","0"));
    }

    static int compare(String a,String b){
        if(a.length()>b.length()){
            return 2;
        }
        else if(a.length()<b.length()){
            return 0;
        }
        else if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
                if(greater(a.charAt(i),b.charAt(i))==2){
                    return 2;
                }
                else if(greater(a.charAt(i),b.charAt(i))==0){
                    return 0;
                }
                else if(greater(a.charAt(i),b.charAt(i))==1 && i!=a.length()-1){
                    continue;
                }
                else if(greater(a.charAt(i),b.charAt(i))==1 && i==a.length()-1){
                    return 1;
                }

            }
            
        }
        return 1;
    }

    static int greater(char a,char b){
        if(a=='0'){
            if(b=='0'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='1'){
            if(b=='0'){
                return 2;
            }
            else if(b=='1'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='2'){
            if("10".indexOf(b)!=-1){
                return 2;
            }
            else if(b=='2'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='3'){
            if("210".indexOf(b)!=-1){
                return 2;
            }
            else if(b=='3'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='4'){
            if("3210".indexOf(b)!=-1){
                return 2;
            }
            else if(b=='4'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='5'){
            if("43210".indexOf(b)!=-1){
                return 2;
            }
            else if(b=='5'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='6'){
            if("543210".indexOf(b)!=-1){
                return 2;
            }
            else if(b=='6'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='7'){
            if("6543210".indexOf(b)!=-1){
                return 2;
            }
            else if(b=='7'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='8'){
            if("76543210".indexOf(b)!=-1){
                return 2;
            }
            else if(b=='8'){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(a=='9'){
            if("876543210".indexOf(b)!=-1){
                return 2;
            }
            else if(b=='9'){
                return 1;
            }
        }
        return 1;
        
    }
        
}
