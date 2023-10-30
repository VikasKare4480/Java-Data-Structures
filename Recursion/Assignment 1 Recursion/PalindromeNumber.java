import java.util.*;

public class PalindromeNumber {


    static int palin = 0;
    static int isPalindrome(int num) {

        if(num == 0) {

            return 0;
        }

        palin = palin * 10 + num % 10;
        isPalindrome(num /= 10);
        
        return  palin;
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        int num1 = num;

        int palidrome = isPalindrome(num1);

        System.out.println(palidrome);

        if(palidrome == num1) {

            System.out.println(num1 + " is palindrome");
        }
        else {

            System.out.println(num1 + " is not palindrome");
        }
    }
}
