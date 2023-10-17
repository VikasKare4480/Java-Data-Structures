/*
 * 
 * Title ->> Print the sum of all the subArrays of the array 
 * time -->> O(N^3)
 * Space -->> O(1)
 */

import java.util.*;

public class SumOfSubArrays {
    
    static void sumOfEachSubArray(int[] arr, int N) {

        for(int i = 0; i < N; i++) {

            for(int j = i; j < N; j++) {

                int sum = 0;

                for(int k = i; k <= j; k++) {

                    sum += arr[k];

                }
                System.out.print(sum + " ");     
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int size = sc.nextInt();

        System.out.println();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {

            System.out.print("Enter " + (i + 1) + " Element : ");
            arr[i] = sc.nextInt();
        }

        sumOfEachSubArray(arr, size);
    }
}   
