package Recursion;

import java.util.Scanner;

class Recursion1 {


    void fun(int num) {

        if(num == 0) {
            return;
        }

        System.out.println(num);
        fun(num - 1);
        
    }


    public static void main(String[] args) {

        Recursion1 rec = new Recursion1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Main Start");
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        rec.fun(num);

        System.out.println("Main End");
        sc.close();
        
    }
    
}
