//both ways,rounding off and ceiling.
class rhombus{
	public static void main(String[] args){
		int n=20;
		int size=(int)Math.ceil(n/2);
		for(int i=1;i<=size;i++){
			for(int j=size-i;j>0;j--){
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=(size-1);i>=1;i--){
			for(int j=(size-i);j>0;j--){
				System.out.print(" ");
			}
			for(int m=i;m>0;m--){
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}
