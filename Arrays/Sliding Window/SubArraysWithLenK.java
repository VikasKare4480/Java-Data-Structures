

/*
 * Titile - Find the subarrays with lenght K 
 * Time -- o(N^2)
 * Space -- O(1)
 */
import java.util.*;


public class SubArraysWithLenK {

    // O(N^2)
    static int subArraysWithLenK(int[] arr, int k) {

        int subCount = 0;
        int len = arr.length;

        for(int i = 0; i <= len - k; i++) {

            for(int j = i; j < len; j++) {

                if(j - i == k - 1) {

                    subCount++;
                }

            }
        }

        return subCount;
    }


    static int optimized(int[] arr, int k) {

        return arr.length - k + 1;
    }

    static int inoNTime(int[] arr, int k) {

        int i = 0;
        int subCount = 0;

        while(i < arr.length) {

            if(i + (k - 1) <= arr.length - 1) {

                subCount++;
            }
            i++;
        }
        return subCount;

    }


    static int sirsSolution(int[] arr, int k) {

        int left = 0;
        int right = k - 1;
        int subCount = 0;

        
        while(right < arr.length) {

            left++;
            right++;
            subCount++;
        }

        return subCount;
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

        System.out.print("Enter the length K : ");
        int K = sc.nextInt();

        // System.out.println("Subarrays with length " + K + " is " + subArraysWithLenK(arr, K));
        
        // System.out.println("Subarrays with length " + K + " is " + inoNTime(arr, K));

        // System.out.println("Subarrays with length " + K + " is " + sirsSolution(arr, K));


        System.out.println("Subarrays with length " + K + " is " + optimized(arr, K));

    }
}
