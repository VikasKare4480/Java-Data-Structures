

import java.util.*;
public class Palindromenumber {

    static int reversed = 0;

    static int isPalindrome(int num) {

        if(num == 0) {
            return 0;
        }

        reversed = reversed * 10 + num %  10;
        isPalindrome(num / 10);

        return reversed;
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");

        int num = sc.nextInt();

        int productOfDigits = isPalindrome(num);
        int copy1 = num;

        if(productOfDigits == copy1) {

            System.out.println(copy1 + " is palindrome number");

        }else {

            System.out.println(copy1 + " is not a palidrome number");
        }

        int reversed = 0;
       

        while(num > 0) {

            reversed = reversed * 10 + num % 10;
            num /= 10;
        }   
        
        if(reversed == copy1) {

            System.out.println(copy1 + " is palindrome number");

        }else {

            System.out.println(copy1 + " is not a palidrome number");
        }
    }
}
