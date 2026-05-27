package Arrays;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {2,3,8,43,23,21,41,33,30};
        int n = arr.length;
        int[] ans = new int[n];
       // method 1 - Bruteforce
//        for(int i=0; i<n-1; i++){
//            int max = Integer.MIN_VALUE;
//            for(int j=i+1; j<n; j++) {
//                if (arr[j] > max) {
//                    max = arr[j];
//                }
//
//            }
//            ans[i] = max;
//        }
//        ans[n-1] = -1;
        //method 2 - optimize
        int max = -1;
        int i = n-1;
        while(i>=0){
            ans[i] = max;
//            if(arr[i]>max){
//                max = arr[i];
//            }
            max = Math.max(max,arr[i]);
            i--;
        }


        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
