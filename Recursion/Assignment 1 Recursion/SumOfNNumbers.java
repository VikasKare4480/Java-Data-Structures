

import java.util.*;

public class SumOfNNumbers {


    static int sum = 0;
    static int sumOfNNatural(int num) {

        if(num == 0) {

            return 0;
        }

        sum += num;

        return num + sumOfNNatural(--num);
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int sum = sumOfNNatural(num);
        System.out.println(sum);

        System.out.println(SumOfNNumbers.sum);
    }
}
