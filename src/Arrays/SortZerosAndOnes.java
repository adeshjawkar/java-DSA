package Arrays;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1,0,0,1,1,1,0,0};
        int n = arr.length;
//        //method 1
//        int noOfZeros =0, noOfOnes=0;
//        for(int i =0; i<n; i++){
//            if(arr[i]==0) noOfZeros++;
//            else noOfOnes++;
//        }
//        for(int i=0; i<n; i++){
//            if(i<noOfZeros) arr[i]=0;
//            else arr[i]=1;
//        }
        //method 2
        int i=0;
        int j=n-1;

        while(i<j){
            if(arr[i]==0 ){
                i++;

            }
            else if(arr[j]==1){
                j--;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

}
