/*
 * Given an array so find the preFixSum array and return it and print it 
 */

package prefixSum;

import java.util.*;

public class prefixSum {
    
    static int[] psArray(int[] arr, int N) {

        int[]  psArray = new int[N];

        psArray[0] = arr[0];

        for(int i = 1; i < N; i++) {

            psArray[i] = psArray[i - 1] + arr[i];
        }
        printArray(psArray);
        return psArray;
    }

    static void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        System.out.println();
        psArray(arr, N);
       
    }
}
