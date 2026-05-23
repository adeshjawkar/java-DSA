package Arrays;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int[] arr = {3,99,4,29,7,5,4,9};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
