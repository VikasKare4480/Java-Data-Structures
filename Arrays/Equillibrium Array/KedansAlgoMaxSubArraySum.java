/*

    Kedans algorithm -->> To find the SubArray of maximum sum
    Time ->> O(N)
    Space -->> O(1)

    Only 3 st

*/

import java.util.Scanner;

public class KedansAlgoMaxSubArraySum {
    
    static int kedansAlgoForMaxSubArraySum(int[] arr, int N) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
  
        for(int i = 0 ; i < N; i++) {

            // Step - 1
            sum += arr[i];

            // Step - 2
            if(sum > maxSum) {

                maxSum = sum;
            }

            // Step - 3
            if(sum < 0) {

                sum += arr[i];
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++) {

            System.out.print("Enter " + (i + 1)  + " element : ");
            nums[i] = sc.nextInt();
        }

        System.out.println("max sum of the SubArray is : " + kedansAlgoForMaxSubArraySum(nums, size));

    }
}
