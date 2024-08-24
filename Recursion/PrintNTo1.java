package Recursion;

import java.util.Scanner;

public class PrintNTo1 {


    static void fun(int num) {

        if(num == 0)
            return;

        System.out.println(num);
        fun(num - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        fun(num);
        sc.close();
    }
    
}
