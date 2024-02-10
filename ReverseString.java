import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseString {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the String to reverse : ");
        String str = br.readLine();
        System.out.println("This is the reversethe " + reverseString(str));
    }

    static String reverseString(String str) {

        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

}