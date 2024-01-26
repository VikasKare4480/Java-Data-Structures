package Easy_;
import java.util.*;
public class _4_evenOddSum {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int evenSum = 0;
        int oddSum = 0;

        for (int number : arr) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Odd numbers sum = " + oddSum);
        System.out.println("Even numbers sum = " + evenSum);
    }
}
