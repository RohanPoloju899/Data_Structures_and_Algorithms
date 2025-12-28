class rohan12{
	public static void main(String[] args){
		int n=101,sum=1,step_count=0;
		for(int i=1;i<=(n-1);i++){
			if(prime(i+1)){
				continue;
			}
			if(even(n)){
				if(!even(i+1)){
					continue;
				}
			}
			if(!even(n)){
				if(even(i+1)){
					continue;
				}
			}
			sum+=(i+1);
			step_count++;
			System.out.print("after "+step_count+my_prefix(step_count)+" iteration: ");
			for(int j=(i+1);j>=1;j--){
				if(prime(j)){
					continue;
			        }
				if(even(n)){
					if(!even(j)){
						continue;
					}
				}
				if(!even(n)){
					if(even(j)){
						continue;
					}
				}
				System.out.print(j);
				if(j>1){
					System.out.print("+");
				}
			}
			System.out.println("="+sum);
		}
	}

	static String my_prefix(int num) {
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

	static boolean prime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	static boolean even(int n){
		if(n==1){
			return false;
		}
		if(n%2==0){
			return true;
		}
		return false;	
	}
}

