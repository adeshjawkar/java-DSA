package Arrays;

public class SortZerosOnesAndTwos {
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 1, 2, 0, 2, 2, 1, 0};
        int n = arr.length;
//        int noOfZeros = 0;
//        int noOfOnes = 0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0) noOfZeros++;
//            else if(arr[i]==1) noOfOnes++;
//
//        }
//        for(int i=0; i<n; i++){
//            if(i<noOfZeros) arr[i]=0;
//            else if(i<noOfZeros+noOfOnes) arr[i]=1;
//            else arr[i]=2;
//        }
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]== 1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
