package Arrays;

public class MaxV {
    public static void main(String[] args) {
        int[] arr = {2,3,47,5,6,7,8,9};
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
