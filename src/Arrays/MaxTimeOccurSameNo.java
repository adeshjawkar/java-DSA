package Arrays;

public class MaxTimeOccurSameNo {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,2,2,3,2,3,3,3,2};
        int n = arr.length;
        int count = 0;
        int maxCountNum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>maxCountNum){
                    maxCountNum = count;
                    maxCountNum = arr[j];
                }

            }
        }
        System.out.println(maxCountNum);

    }

}
