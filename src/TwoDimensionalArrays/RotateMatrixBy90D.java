package TwoDimensionalArrays;

public class RotateMatrixBy90D {
    public static void print(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,},{4,5,6},{7,8,9}};
        int m = mat.length;
        int n = mat[0].length;
        print(mat);
        //First transpose matrix
        for(int i=0; i<m; i++){
            for(int j=0; j<i ;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        print(mat);

      // Reverse each row
        for(int i=0; i<n; i++){
            int a=0, b = n-1;
            while(a<b){
                int temp = mat[i][a];
                mat[i][a]=mat[i][b];
                mat[i][b]=temp;
                a++;
                b--;
            }
        }
        print(mat);

    }
}
