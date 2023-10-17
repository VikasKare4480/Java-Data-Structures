/*
 * Print the sum of each subarray By using Prefix sum apprroach
 * 
 * Time -- O(N^2)
 * Space -->> O(N)
 */

import java.util.Scanner;

public class SubArraySumWithprefixSum {


    static void subArraySumPrefixSum(int[] arr, int N) {

        // Crete a prefix sum array -->> O(N)

        int[] psArray = new int[N];

        psArray[0] = arr[0];

        for(int i = 1; i < N; i++) {

            psArray[i] = psArray[i - 1] + arr[i];
        }

        // Print  sum of each subarray using the prefix Sum array
        
        int sum = 0;
        for(int i = 0; i < N; i++) {

            for(int j = i; j < N; j++) {

                sum = 0;
                if(i == 0) 
                    sum = psArray[j];
                else 
                    sum = psArray[j] - psArray[i - 1];
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

        subArraySumPrefixSum(arr, size);
    }
    
}
