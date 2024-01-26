import java.io.*;
import java.util.*;

class _32_sumOfFPaires {

    static int maxSum(int[] arr) {

        int mod = 1000000007;

        Arrays.sort(arr);

        int maxSum = 0;

        for(int i = 0; i < arr.length; i++) {

            maxSum += (long) (arr[i] * i) % mod;

        }

        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
            
        }
        int maxSum = maxSum(arr);
        System.out.println("maxSum is : " + maxSum);
    }
}
