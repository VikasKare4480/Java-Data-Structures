package Recursion;

import java.util.Scanner;

public class SumUptoNum {

    static int count = 0;
    static int sumUptoNum(int num) {

        count++;
        if(num == 0) 
            return 0;

        return num + sumUptoNum(num - 1);
    }

    static int sum = 0;
    static int i = 1;

    static int sumUptoN(int num) {

        if(i ==  num) {
            sum += i;
            return sum;
        }
        sum += i;
        i++;
        return sumUptoN(num);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        // System.out.println(sumUptoNum(num));

        System.out.println("No of stacs pushed : " + count);

        System.out.println("SumUptoN : " + sumUptoN(num));
    }
}
