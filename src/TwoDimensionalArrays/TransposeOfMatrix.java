package TwoDimensionalArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4},{5,6},{7,8}};
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] trans = new int[n][m];

        for(int i = 0; i <n; i++){
            for(int j = 0; j <m; j++){
                trans[i][j] = matrix[j][i];
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
