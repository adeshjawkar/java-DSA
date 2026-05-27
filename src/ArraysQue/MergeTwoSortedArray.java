package ArraysQue;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {21,43,56,76,90,95,99,121,132,144,178};
        int[] arr2 = {12,32,44,58,87,98,126};
        int[] arr3 = new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;


        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{//(arr1[i]>arr2[j])
                arr3[k]=arr2[j];
                j++;
                k++;

            }
        }
        //if(i==arr1.length){
            while(j<arr2.length){
                arr3[k]=arr2[j];
                j++; k++;
            }
       // }
        //if(j==arr2.length){
            while(i<arr1.length){
                arr3[k]=arr1[i];
                i++; k++;
            }
        //}
        for(int ele : arr3){
            System.out.print(ele+" ");
        }
    }
}
