package String;

public class PrintSubstringOfString {
    public static void main(String[] args) {
        String str = "adesh";
        int n = str.length();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n+1; j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
