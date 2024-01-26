import java.io.*;
import java.util.*;

public class _35_minimumProduct {

    static int minimumProduct(int[] arr, int k) {
        
    Arrays.sort(arr);
    int minProduct = 1;

    for(int i = 0; i < k; i++) {

            minProduct *= arr[i];
    }

        return minProduct;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();  
        }

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        System.out.println(minimumProduct(arr, k));

    }
}
