

import java.util.*;

class DigitSum {

    static int digitSum1 = 0;

    static int digitSum(int num) {

        if(num == 0) {

            return 0;
        }
        
        return  num % 10 + digitSum(num /= 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int digitSum = digitSum(num);
        System.out.println("DigitSum : " + digitSum(num));

    }
}