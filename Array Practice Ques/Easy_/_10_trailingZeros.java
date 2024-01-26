package Easy_;
import java.util.*;


public class _10_trailingZeros {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Split the string into individual digits
        String[] digits = numberStr.split("");

        // Initialize a variable to count trailing zeros
        int trailingZerosCount = 0;

        // Iterate through the digits in reverse order
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i].equals("0")) {
                trailingZerosCount++;
            } else {
                break; // Exit the loop when a non-zero digit is encountered
            }
        }

        System.out.println("Number of trailing zeros: " + trailingZerosCount);
    }
}
    

