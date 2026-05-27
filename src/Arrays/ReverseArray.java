package Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr  = {2,3,4,5,6,7};
        int n = arr.length;
        //int i=1, j = 4;   reverse part of array
        int i=0, j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int k = 0; k <n; k++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
