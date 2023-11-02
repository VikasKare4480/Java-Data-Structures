
import java.util.*;

public class PerfectNumber {

    static int sum = 0;
    static int i = 1;
    static int perfectNumber(int num) {

        if(num == 1) {

            return 0;
        }
        
        if(i == num - 1) { // excude itself

            return sum;
        }
        if(num % i == 0) {

            sum += i;
        }
        i++;
        return perfectNumber(num);
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        int sum = perfectNumber(num);
        System.out.println(sum);
        if(sum == num) {

            System.out.println(num + " is perfect number");
        }
        else {

            System.out.println(num + " is not a perfect number");
        }

    }
}
