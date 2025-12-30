import java.util.Scanner;
class rohan13{
	public static void main(String[] args){
		int input,sum=0,triangular=0,sum2=0;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter the number: ");
			String str=sc.nextLine();
			if(str.matches("\\d+")){
				input=Integer.parseInt(str);
			}
			else{
				break;
			}
			for(int i=1;i<input;i++){
				sum+=i;
				if(sum>=input){
					triangular=i;
					break;
				}
				triangular=i;
			}
			for(int i=1;i<triangular;i++){
				sum2+=i;
			}
			int d1=sum-input;
			int d2=input-sum2;
			if(d1>d2){
				System.out.println("nearest triangular number is: "+sum2+", "+(triangular-1)+prefix(triangular-1)+" number in sequence");
			}
			else{
				System.out.println("nearest triangular number is: "+sum+", "+triangular+prefix(triangular)+" number in sequence");
			}
		}
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
