package Easy_;

import java.util.ArrayList;
import java.util.Scanner;

public class _8_findArstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Find Armstrong numbers and store them in a new list
        ArrayList<Integer> armstrongNumbers = findArmstrongNumbers(inputArray);

        // Print the Armstrong numbers
        System.out.println("Armstrong Numbers in the array:");
        for (int armstrong : armstrongNumbers) {
            System.out.println(armstrong);
        }
    }

    public static ArrayList<Integer> findArmstrongNumbers(int[] arr) {
        ArrayList<Integer> armstrongNumbers = new ArrayList<>();

        for (int num : arr) {
            if (isArmstrongNumber(num)) {
                armstrongNumbers.add(num);
            }
        }

        return armstrongNumbers;
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum, remainder, result = 0, n = 0;

        originalNum = num;
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }
        return result == num;
    }
}
