package Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,8};
        int n = arr.length;
        System.out.println(n);
        int k = 6;
        int j =n-1-k;
        for(int i=0; i<=(n-1-k)/2; i++){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        int p = n-1;
        for(int i=n-k; i<(n-k+n)/2; i++){
            int temp = arr[i];
            arr[i]=arr[p];
            arr[p]=temp;
            p--;
        }
        int a = n-1;
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
            a--;
        }


        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
