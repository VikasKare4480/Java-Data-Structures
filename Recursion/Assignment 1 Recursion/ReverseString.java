import java.util.Scanner;

public class ReverseString {


    static String reverseString(String str) {

        if(str.length() == 0) {

            return "";
        }
        return str.substring(1) + str.charAt(0);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.println("Reverse is : " + reverseString(str));
    }
    
}
