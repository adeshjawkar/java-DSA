package ArraysQue;

public class NextGreatestElementM2 {
    public static void main(String[] args) {
        int[] arr = {12,43,90,32,76,88,66,87,31};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1]=-1;


        int nge = arr[n-1];
        for(int i=n-1; i>=0; i--){
            ans[i]=nge;
            nge = Math.max(nge,arr[i]);
        }

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
