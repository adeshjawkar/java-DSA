package TwoDimensionalArrays;

public class SumOfAllElement {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{1,2,3}};
        int sum =0;
        int product = 1;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + arr[i][j];
                product *= arr[i][j];

            }

        }
        System.out.println(sum);
        System.out.println(product);
    }
}
