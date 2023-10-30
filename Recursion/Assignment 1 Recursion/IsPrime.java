import java.util.*;

public class IsPrime {

    static boolean prime = true;
   
    static int count = 0;

    static int i = 1;

    static int divisorFunc(int num) {

        if(i == num + 1) {

            return 1;
        } 

        if(num % i == 0) {

            count++;
        }
        i++;
        divisorFunc(num);
        return count;
    }

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int count = divisorFunc(num);

        if(count == 2) {

            System.out.println(num + " is prime");

        }else {

            System.out.println(num + " is not prime");
        }
    }   
}
