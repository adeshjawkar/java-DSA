package TwoDimensionalArrays;

import java.util.Scanner;

public class StoreRollNoAndMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] std = new int[4][2];
        for(int i=0; i<4; i++){
            for (int j = 0; j < 2; j++) {
                std[i][j] = sc.nextInt();

            }
        }
        for(int i=0; i<4; i++){
            for (int j = 0; j < 2; j++) {
                System.out.print(std[i][j]+" ");

            }
            System.out.println();

        }

    }
}
