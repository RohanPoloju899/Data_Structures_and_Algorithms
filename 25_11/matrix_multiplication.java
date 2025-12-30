class matrix_multiplication{
	public static void main(String[] args){
		int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
		int result[][]=matrix_multiply(arr1,arr2);
		for(int i[] : result){
			for(int j : i){
				System.out.print(j+" ".repeat(max_digit(result)-String.valueOf(j).length()+1));
			}
			System.out.println();
		}
	}
	
	static int[][] matrix_multiply(int[][] arr1,int[][] arr2){	
		int[][] c=new int[arr1.length][arr2[0].length];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2[0].length;j++){
				for(int k=0;k<arr2.length;k++){
					c[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		return c;
	}
	
	static int max_digit(int[][] arr){
		int max_digit=String.valueOf(arr[0][0]).length();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(String.valueOf(arr[i][j]).length()>max_digit){
				max_digit=String.valueOf(arr[i][j]).length();
				}
			}
		}
		return max_digit;
	}
}
