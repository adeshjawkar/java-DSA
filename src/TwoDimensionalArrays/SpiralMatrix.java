package TwoDimensionalArrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,17},{5,6,7,8,18},{9,10,11,12,19},{13,14,15,16,20}};
        int n = arr.length;
        int m = arr[0].length;
        int minr= 0, maxr = n-1;
        int minc = 0, maxc = m-1;

           while(minr<=maxr && minc<=maxc){
               for(int j=minc; j<=maxc; j++){
                   System.out.println(arr[minr][j]);
               }
               minr++;
               for(int i=minr; i<=maxr; i++){
                   System.out.println(arr[i][maxc]);
               }
               maxc--;
               for(int j=maxc; j>=minc; j--){
                   System.out.println(arr[maxr][j]);
               }
               maxr--;
               for(int i=maxr; i>=minr; i--){
                   System.out.println(arr[i][minc]);
               }
               minc++;
           }
        }
    }

