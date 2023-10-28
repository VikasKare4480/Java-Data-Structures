package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    // Without using third variable 

    static int sumOfDigits(int num) {

        if(num == 0) 
            return 0;

        return num % 10 + sumOfDigits(num /= 10);
    }

    // With using third variable

    static int digitsum = 0;

    static int digitSumCal(int num) {

        if(num == 0) 
            return 0;
        
        digitsum += num % 10;
        digitSumCal(num /= 10);
        return digitsum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println("Sum of digits are : " + sumOfDigits(num));
    }
    
}
