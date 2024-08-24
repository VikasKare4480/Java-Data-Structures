package Recursion;

import java.util.Scanner;

public class DoubleRecursion {
    
    static int doubleRecursion(int num) {

        if(num <=  1)
            return 1;

        return doubleRecursion(num - 2) + doubleRecursion(num - 1);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");

        int num = sc.nextInt();
        
        System.out.println(doubleRecursion(num));
        sc.close();
    }
}
