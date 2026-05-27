package TwoDimensionalArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //for 2D array
        int[][] a = {{2,3,4},{5,6,7}};
        for(int[] ele : a){
            for(int x  : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
