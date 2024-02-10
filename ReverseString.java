import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseString {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the String to reverse : ");
        String str = br.readLine();
        System.out.println("This is the reverse :  " + reverseString(str));

        if(isPalindrome(str)) {

            System.out.println(str + " is palindrome String");
        }else {

            System.out.println(str + " is not palindrome String");
        }
    }

    static String reverseString(String str) {

        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    static boolean isPalindrome(String str) {

        System.out.println(str.getClass());
        System.out.println(reverseString(str).getClass());
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(reverseString(str)));
        return str == reverseString(str);
    }
}