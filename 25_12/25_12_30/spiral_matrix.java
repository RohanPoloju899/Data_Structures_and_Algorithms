import java.util.*;

class spiral_matrix{
    public static void main(String[] args) {
        int m=3,n=4;
        ArrayList<ArrayList<Integer>> arr=build_matrix(m,n);
        for(ArrayList<Integer> row:arr){
            for(int x:row){
                System.out.print(x+" ".repeat(max_digit(arr)-String.valueOf(x).length()+1));
            }
            System.out.println();
        }
    }

    static ArrayList<ArrayList<Integer>> build_matrix(int r,int c){
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<r;i++){
            matrix.add(new ArrayList<>(Collections.nCopies(c, 0)));
        }
        int top=0,bottom=r-1,left=0,right=c-1,value=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                matrix.get(top).set(i,value++);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix.get(i).set(right,value++);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix.get(bottom).set(i,value++);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    matrix.get(i).set(left,value++);
                }
                left++;
            }
        }
        return matrix;
    } 

    static int max_digit(ArrayList<ArrayList<Integer>> matrix){
        int max=0;
        for(ArrayList<Integer> row:matrix){
            for(int x:row){
                if(x>max){
                    max=x;
                }
            }
        }
        return String.valueOf(max).length();
    }
    
}
