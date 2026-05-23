package Arrays;

import java.util.ArrayList;

public class RearrangedTheArraysElement {
    public static void main(String[] args) {
        int[] arr = {-2,-5,-9,-5,8,-2,7,3,-4,1};
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                a.add(arr[i]);
            }
            else{
                b.add(arr[i]);
            }
        }
        int p = a.size();
        int q = b.size();
            if(p>q){
                for(int i=0; i<q; i++){
                    arr[i*2]=a.get(i);
                    arr[i*2+1]=b.get(i);
            }
                int index = q*2;
                for(int i=q; i<p; i++){
                    arr[index]=a.get(i);
                    index++;
                }
        }
            else{
                for(int i=0; i<p; i++){
                    arr[i*2]=a.get(i);
                    arr[i*2+1]=b.get(i);
                }
                int index = p*2;
                for(int i=p; i<q; i++){
                    arr[index]=b.get(i);
                    index++;
                }
            }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
