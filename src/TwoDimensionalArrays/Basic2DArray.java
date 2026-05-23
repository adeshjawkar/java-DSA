package TwoDimensionalArrays;

public class Basic2DArray {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid[0][0]= 10;
        grid[0][1]= 20;
        grid[0][2]= 30;
        grid[1][0]= 40;
        grid[1][1]= 50;
        System.out.println(grid[0][0]);
        int n = grid.length;
        System.out.println(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(grid[i][j]);
            }
        }
    }
}
