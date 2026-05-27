package ArraysQue;

public class Sort0And1s {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,1,1,0,0};
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==1){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
