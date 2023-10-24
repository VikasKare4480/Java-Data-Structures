package LeetCode0;

import java.util.Scanner;

class Solution {

    
    static int[] twoSum(int[] nums, int target) {

         int[] ret = new int[2];
    
        for(int i = 0; i < nums.length; i++) {


            for(int j = 0; j < nums.length; j++) {

                if(i == j) {
                    continue;
                }
                if(nums[i] + nums[j] == target) {
                    
                    ret[0] = j;
                    ret[1] = i;
                }
            }
        }
        return ret;
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

        int[] arr1 = twoSum(arr, size);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}