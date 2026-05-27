package TwoDimensionalArrays;

import java.util.Scanner;

public class InputOutputOf2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int m = arr.length;
        int n = arr[0].length;
        Scanner sc = new Scanner(System.in);
        // Input of 2D Array
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Output of 2D Array
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
