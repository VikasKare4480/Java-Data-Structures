package Easy_;

import java.util.*;
public class _6_revmoveSpecific {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to remove
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        int[] newArray = removeElement(array, elementToRemove);

        System.out.println("Array after removing " + elementToRemove + ":");
        printArray(newArray);
    }

    public static int[] removeElement(int[] arr, int element) {
        int count = 0; // Count of elements to keep in the new array

        // Count the elements that are not equal to the element to remove
        for (int num : arr) {
            if (num != element) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int newIndex = 0;

        // Copy elements from the original array to the new array, excluding the element to remove
        for (int num : arr) {
            if (num != element) {
                newArray[newIndex] = num;
                newIndex++;
            }
        }

        return newArray;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
    
