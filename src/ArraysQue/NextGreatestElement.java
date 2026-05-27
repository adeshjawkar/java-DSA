package ArraysQue;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,43,99,45,55,34,65,87,67,90,87};
        int n = arr.length;
        int[] ans = new int[n];
        //method -1
        ans[n-1] = -1;
        for(int i=0; i<n-1; i++){
            int mx = Integer.MIN_VALUE;
            for(int j= i+1; j<n ; j++){
                mx = Math.max(mx,arr[j]);
            }
            ans[i]=mx;
        }
        for(int ele : ans){
            System.out.print(ele+" ");
        }


    }
}
