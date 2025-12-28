import java.util.ArrayList;

// allocates matrix in simple column wise instead of row wise

class matrix_allocation{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=build_matrix(4,3);
        for(ArrayList<Integer> row:matrix){
            System.out.print("[");
            for(int x:row){
                System.out.print(x+" ");
            }
            System.out.println("]");
        }
    }

    static ArrayList<ArrayList<Integer>> build_matrix(int r,int c){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int temp=1;
        for(int i=0;i<r;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<c;j++){
                row.add((temp+j*r));
            }
            res.add(row);
            temp++;
        }
        return res;
    }
}
