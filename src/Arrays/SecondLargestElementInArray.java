package Arrays;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {34,39,83,38,93};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(arr[i],max);
        }

        int smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = Math.max(arr[i],smax);
            }
        }
        System.out.println(smax);
    }
}
