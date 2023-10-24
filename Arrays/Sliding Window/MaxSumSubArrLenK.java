

import java.util.*;

public class MaxSumSubArrLenK {
    
    static int subArrMaxSumLenK(int[] arr, int k) {

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            int sum = 0;
            
            if(i + k < arr.length) {

                for(int j = i; j <= i + k; j++) {

                    sum = sum + arr[j];
                }
            }

            if(maxSum < sum) {

                maxSum = sum;
            }
        }
        return maxSum;
    }

    static int sirsSolution(int[] arr, int k) {

        int left = 0; 
        int right = k - 1;
        int maxSum = Integer.MIN_VALUE;

        while(right < arr.length) {

            int sum = 0;

            for(int j = left; j <= right; j++) {

                sum += arr[j];
            }

            if(maxSum < sum) {

                maxSum = sum;
            }
            left++;
            right++;
        }

        return maxSum;
    }

    // Time -- O(N)
    // Space -- O(N)

    static int withPrefixSum(int[] arr, int k) {

        int[] psArr = new int[arr.length];

        psArr[0] = arr[0];

        for(int i = 1; i < psArr.length; i++) {

            psArr[i] = psArr[i - 1] + arr[i];
        }

        int start = 0;
        int end = k - 1;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        while(end < arr.length) {

            if(start == 0){

                sum = psArr[0];

            }else {

                sum = psArr[end] - psArr[start - 1];
            }

            if(maxSum < sum) {

                maxSum = sum;
            }
            start++;
            end++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        // System.out.println("maxSum with lenght K is " + subArrMaxSumLenK(arr, k));

        System.out.println("maxSum with lenght K is " + withPrefixSum(arr, k));

    }

}
