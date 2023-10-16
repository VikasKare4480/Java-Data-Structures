

import java.util.*;

public class _3_rangeSubQuery {


    static int[] rangeSubquery(int[] arr, int N, int[][] arr2) {

        int[] sumArray = new int[arr2.length];
        
        for(int i = 0; i < arr2.length; i++) {

            for(int j = 0; j < arr2.length; j++) {

                int start = arr2[i][j];
                int end = arr2[i][j + 1];
                int sum = 0;
                for(int k = start; k <= end; k++) {

                    sum = sum + arr[k];
                }
                sumArray[i] = sum;
            }
        }
        return sumArray;
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

        System.out.println("Enter the size of the 2D array : ");
        int size2 = sc.nextInt();

        int[][] arr2 = new int[size2][];

        int[] sumArray = rangeSubquery(arr, N, arr2);

        for(int i = 0; i < sumArray.length; i++) {

            System.out.print(" " + sumArray[i]);
        }
    }
    
}
