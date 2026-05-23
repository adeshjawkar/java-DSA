package Arrays;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {8,-3,2,4,2,7,6,99};
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            min= Math.min(arr[i],min);
        }
        System.out.println(min);
    }
}
