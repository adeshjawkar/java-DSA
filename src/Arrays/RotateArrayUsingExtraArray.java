package Arrays;

public class RotateArrayUsingExtraArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int k =3;
        int[] result = new int[n];
        System.out.println(n);
        for(int i=0; i<n-k; i++){
            result[i]= arr[i+k];
        }
        for(int i=n-k; i<n; i++){
            result[i] = arr[i-(n-k)];
        }
        for(int ele : result){
            System.out.print(ele+" ");
        }

    }
}
