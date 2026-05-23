package TwoDimensionalArrays;

public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{2,3,40},{7,8,9},{1,5,77}};
        int m = arr.length;
        int n = arr[0].length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                }

            }

        }
        System.out.println("max is :"+ max);
        System.out.println("min is : "+min);
    }
}
