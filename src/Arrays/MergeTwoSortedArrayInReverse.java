package Arrays;

public class MergeTwoSortedArrayInReverse {
    public static void main(String[] args) {
        int[] arr1 = {11,33,66,68,89,90};
        int[] arr2 = {22,28,32,66,77,88,99,111,199,343};
        int m = arr1.length, n = arr2.length;
        int[] ans = new int[m+n];
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        System.out.println(m);
        while(i>=0 && j>=0){
            if(arr1[i]>=arr2[j]){
                ans[k] = arr1[i];
                i--; k--;
            }
            else{
                ans[k] = arr2[j];
                j--; k--;
            }
        }
        while(i>=0){
            ans[k] = arr1[i];
            i--;
            k--;
        }
        while(j>=0){
            ans[k]=arr2[j];
            j--;
            k--;
        }
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
