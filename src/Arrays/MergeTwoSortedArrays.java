package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {12,18,25,30,56};
        int[] arr2 = {7,21,28,35,45,55,66,69,78};
        int m = arr1.length;
        int n = arr2.length;
        int[] ans = new int[m+n];
        int i = 0;
        int j =0;
        int k =0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }
            else{
                ans[k ]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k]= arr2[j];
            j++;
            k++;
        }
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
