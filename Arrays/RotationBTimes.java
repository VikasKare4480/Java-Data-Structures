/*
 * Rotate the given array B times 
 * Time -->> O(N^2)
 * Space -->> O(1)
 */

import java.util.*;

public class RotationBTimes {

    // leftRotation 
    static int[] rotationBTimesleft(int[] arr, int N, int B) {

        for (int i = 0; i < B; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }

        return arr;
    }

    // rightRoatation

    // static int[] rotateArrayRight(int[] arr, int N, int B) {
    //     for (int rotation = 0; rotation < B; rotation++) {
    //         // Store the last element of the array
    //         int lastElement = arr[N - 1];
    
    //         // Shift each element to the right by one position
    //         for (int j = N - 1; j > 0; j--) {
    //             arr[j] = arr[j - 1];
    //         }
    
    //         // Place the stored last element at the beginning
    //         arr[0] = lastElement;
    //     }
    
    //     return arr;
    // }
    static int[] rotateArrayRight(int[] arr, int N, int B) {
        // Ensure B is within the range [0, N) to avoid unnecessary rotations
        B = B % N;
        
        // Create a temporary array to store the rotated elements
        int[] rotatedArr = new int[N];
        
        // Copy the elements after rotation to the temporary array
        for (int i = 0; i < N; i++) {
            rotatedArr[(i + B) % N] = arr[i];
        }
        
        // Copy the rotated array back to the original array
        System.arraycopy(rotatedArr, 0, arr, 0, N);
        
        return arr;
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
       
        System.out.print("Enter the number of rotations : ");
        int B = sc.nextInt();
        
        // rotationBTimes(arr, size, B);
        // rotationBTimesleft(arr, size, B);
        rotateArrayRight(arr,size,B);
        printArray(arr);
        sc.close();
    }

    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
