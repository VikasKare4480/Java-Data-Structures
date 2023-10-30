
import java.util.*;

public class OccurancesOfDigits {
    
    static int count = 0;

    static int frequencyCount(int num, int digit) {
    
        if(num == 0) {

            return 0;
        }

        if(num % 10 == digit) {

            count++;
        }
        frequencyCount(num /= 10, digit);
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Enter digit : ");
        int digit = sc.nextInt();

        System.out.println();
        System.out.print("digitFequency " + frequencyCount(num, digit));
    }
}

