package String;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Adesh");
        int n = sb.length();
        int i= 0;
        int j = n-1;
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;

        }
        System.out.println(sb);
    }
}
