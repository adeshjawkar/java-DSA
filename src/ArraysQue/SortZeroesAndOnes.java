package ArraysQue;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,0,0,1,1,0};
        int n = arr.length;
        int i=0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else{
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
        }
        for(int ele : arr){
            System.out.println(ele+" ");
        }
    }
}
