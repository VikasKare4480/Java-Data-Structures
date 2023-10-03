/*
 * Reverse the array elements int 
 * Time -->> O(N)
 * Space -->> O(1)
 * 
 * Approaches 
 * 1 Swapping 
 * 2 Two Pointer apprach
 */

import java.util.Scanner;

public class reverseElemetns {

    static int[] reverseElemetns(int[] arr, int N) {


        for(int i = 0; i < N / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - 1 - i] = temp;
        }

        return arr;

    }

    static int[] twoPointerApprach(int[] arr, int N) {

        int left = 0;
        int right = N - 1;

        // Swap the elemetnts from the array 

        while(left < right) {

            // swap actual
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;


            // Move the pointers 
            left++;
            right--;
        }

        return arr;
    }


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
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        // printArray(reverseElemetns(arr, size));
        printArray(twoPointerApprach(arr, size));
    }
}
