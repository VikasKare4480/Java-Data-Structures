
import java.math.BigInteger;
import java.util.*;


public class FactorialNumber {

    static long factorial(long num) {

        if(num == 0) {

            return 1;
        }

        return num * factorial(num - 1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        long num = sc.nextInt();  

        System.out.println("Factorial of : " + num + " is : " + factorial(num));
    }    
}
