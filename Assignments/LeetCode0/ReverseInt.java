package LeetCode0;

import java.util.*;

/*
 * Given an integer, reverse digits of an integer.
 */

public class ReverseInt {

    public static  int reverseInteger(int num) {


        int rev = 0;
        while (num != 0) {

            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse : ");
        int num = sc.nextInt();

        System.out.println("Reverse of num is " + reverseInteger(num));

        
    }
}
