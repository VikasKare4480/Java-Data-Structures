
import java.math.*;
import java.util.Scanner;

public class ArmStrongNumber {

    static int sum = 0;
    static int armStrong(int num, int power) {

        if(num == 0) {

            return sum;
        }

        sum += Math.pow(num % 10, power);

        return armStrong(num / 10, power);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int numCopy = num;

        int power = 0;
;
        while (numCopy > 0) {
            power++;
            numCopy /= 10;  
        }

        System.out.println(power);

        int isArmStrong = armStrong(num, power);

        if(isArmStrong == num) {

            System.out.println(num + " is armStrong Number");
        }
        else {

            System.out.println(num + " is not armStrong Number");
        }

    }   
}
