
import java.util.Scanner;

public class Factorial {
    
    static int factorial(int num) {

        if(num < 0) {

            return 0;
        }

        if(num == 0 || num == 1) {

            return 1;
        }
        return num * factorial(--num);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no to find factorial  :");

        int num = sc.nextInt();

        int factorial = factorial(num);
        System.out.println("factorial is : " + factorial);
    }
}
