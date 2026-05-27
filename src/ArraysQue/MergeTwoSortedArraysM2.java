package ArraysQue;

public class MergeTwoSortedArraysM2 {
    public static void main(String[] args) {
        int[] arr1 = {21,43,56,76,90,95,99,121,134,144,178};
        int[] arr2 = {12,32,44,58,87,98,126};
        int[] arr3 = new int[arr1.length+arr2.length];
        int i=arr1.length-1, j=arr2.length-1, k=arr1.length+arr2.length-1;

        while(i>=0 && j>=0){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr2[j];
                k--;
                j--;
            }
            else {
                arr3[k]=arr1[i];
                k--;
                i--;
            }
        }
            while(j>=0){
                arr3[k]=arr2[j];
                j--;
                k--;
        }
            while(i>=0){
                arr3[k]=arr1[i];
                i--;
                k--;

        }
        for(int ele : arr3){
            System.out.print(ele + " ");
        }

    }
}
