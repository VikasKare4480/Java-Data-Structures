

/*
 * Min and Max of the arraay 
 * Given the array of the size N 
 * Tou needs to write a method which returns the sum of
 * Maximum and Minimum of the array 
 */

 import java.util.Scanner;

public class _1_SumOfMaxMin {

    static int sumMaxMin(int[] arr, int N) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // O(N)
        for(int i = 0; i < N; i++) {

            if(arr[i] > max) {

                max = arr[i];
                
            }
            if(arr[i] < min) {

                min = arr[i];
            }
        }
        return min + max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {

            System.out.print("Enter " + (i + 1) + " Elemenet ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of Max and Min : " + sumMaxMin(arr, N));
        sc.close();
    }
    
}
