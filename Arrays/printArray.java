

/*
 * Just print the given array 
 * Time -->> O(N)
 * Space -->> O(1)
 */
import java.util.*;

public class printArray {
    

    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
    }
}
