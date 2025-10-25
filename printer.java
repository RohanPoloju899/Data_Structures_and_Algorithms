import java.util.Scanner;
class printer{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.nextLine().toUpperCase();
		int size=10;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='W'){
				W(size);
			}
			else if(ch=='A'){
				A(size);
			}
			else{
				System.out.println("wrong input");
			}
			System.out.println();
		}
	}
	
	static void W(int size){
		System.out.print("*");
		for(int i=1;i<=(2*size-3);i++){
			System.out.print(" ");
		}
		System.out.print("*");
		for(int i=1;i<=(2*size-3);i++){
				System.out.print(" ");
		}
		System.out.println("*");
		for(int i=2;i<=size-1;i++){
			for(int j=1;j<=(i-1);j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<=(2*(size-i)-1);j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<=(2*i-3);j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<=(2*(size-i)-1);j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=1;i<=(size-1);i++){
			System.out.print(" ");
		}
		System.out.print("*");
		for(int i=1;i<=(2*size-3);i++){
				System.out.print(" ");
		}
		System.out.print("*");
	}



	static void A(int size){
		int half=0;
		if(even(size)){
			half=(int)Math.ceil(size/2.0)+1;
		}
		else{
			half=(int)Math.ceil(size/2.0);
		}
		for(int i=(size-1);i>0;i--){
			System.out.print(" ");
		}
		System.out.println("*");
		for(int i=2;i<half;i++){
			for(int j=(size-i);j>0;j--){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=(2*i-3);j>0;j--){
				System.out.print(" ");
			}
			System.out.println("*");
	    }
	    for(int i=(size-half);i>0;i--){
			System.out.print(" ");
		}
	    for(int i=1;i<=(2*half-1);i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i=(half+1);i<=size;i++){
			for(int j=size-i;j>0;j--){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=(2*i-3);j>0;j--){
				System.out.print(" ");
			}
			System.out.println("*");
		}
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

