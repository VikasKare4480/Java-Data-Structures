
/*
 * find the build the array of left max of size N 
 * leftMax of i contains the maximun of the index i 
 * 
    * Time -->> O(N)
    Space -->> O(1)
 */

import java.util.*;

class LeftMaxArray {

    // Brute Force apporach -->> O(n^2)
    static int[] leftMaxArray(int[] arr, int N) {

        int[] leftMax = new int[N];

        for(int i = 0; i < N; i++) {

            int max = Integer.MIN_VALUE;

            for(int j = 0; j <= i; j++) {

                if(arr[j] > max) {

                    max = arr[j];
                }  
            }
            leftMax[i] = max;
        }
        return leftMax;
    }

    // Optimzed Way -->> O(N)

    static int[] leftMaxOptimised(int[] arr, int N) {

        for(int i = 1; i < N; i++) {

            if(arr[i] < arr[i - 1]) {

                arr[i] = arr[i - 1];
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[size];
        System.arraycopy(arr, 0, arr2, 0, size);


        int[] leftMax = leftMaxArray(arr, size);

        for(int i = 0; i < size; i++) {

            System.out.print(leftMax[i] + " ");
        }


        int[] leftMax2 = leftMaxOptimised(arr2, size);
        System.out.println();

        for(int i = 0; i < size; i++) {

            System.out.print(leftMax2[i] + " ");
        }

        
    }

}
