package ArraysQue;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,9,3};
        int k = 12;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; i<n; i++){
                if(arr[i]+arr[j]==k){
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
