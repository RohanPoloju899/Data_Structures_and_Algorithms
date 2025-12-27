import java.util.ArrayList;

class Matrix_determinant{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=build_matrix();
        int co_factor=co_factor(matrix,0,0);
        System.out.println(co_factor);
    }

    static int co_factor(ArrayList<ArrayList<Integer>> matrix,int i,int j){
        ArrayList<ArrayList<Integer>> temp=build_minor(matrix,i,j);
        return (int)Math.pow(-1,i+j)*determinant(temp);
    }

    static ArrayList<ArrayList<Integer>> build_minor(ArrayList<ArrayList<Integer>> matrix,int i,int j){
        ArrayList<ArrayList<Integer>> temp=new ArrayList<>();
        for(int a=0;a<matrix.size();a++){
            if(a==i){
                continue;
            }
            ArrayList<Integer> row=new ArrayList<>();
            for(int b=0;b<matrix.get(0).size();b++){
                if(b==j){
                    continue;
                }
                row.add(matrix.get(a).get(b));
            }
            temp.add(row);
        }
        return temp;
    }

    static int determinant(ArrayList<ArrayList<Integer>> matrix){
        int n=matrix.size();
        if(n==1){
            return matrix.get(0).get(0);
        }
        int det=0;
        for(int j=0;j<n;j++){
            ArrayList<ArrayList<Integer>> temp=build_minor(matrix, 0, j);
            det+=(int)Math.pow(-1,j)*matrix.get(0).get(j)*determinant(temp);
        }
        return det;
    }

    static ArrayList<ArrayList<Integer>> build_matrix(){
        int rows=3;
        int columns=rows;
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        int value=1;
        for(int i=0;i<rows;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<columns;j++){
                row.add(value++);
            }
            matrix.add(row);
        }
        return matrix;
    }
}
