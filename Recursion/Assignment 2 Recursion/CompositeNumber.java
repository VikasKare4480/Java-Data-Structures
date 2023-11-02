
import java.util.*;

public class CompositeNumber {

    static int i = 1;
    static int count = 0;

    static int composite(int num) {

        if(i == num + 1) {
            return count;
        }

        if(num % i == 0) {
            count++;
        }
        i++;
        return composite(num); 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        if(composite(num) > 2) {

            System.out.println(num + " is a composite");
        }
        else {

            System.out.println(num + " is not composite");
        }
        
    }
}
