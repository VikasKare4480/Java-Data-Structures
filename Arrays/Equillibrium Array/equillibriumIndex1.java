

/*
    Space -->> O(1)
    Time -->> O(N^2)
 */
import java.util.*;

public class equillibriumIndex1 {
    

    static int equillibriumIndex(int[] arr, int N) {

        int lSum;
        int rSum;
        int index = arr.length;

        for(int i = 0; i < N; i++) {
            lSum = 0;
            rSum = 0;
            for(int j = 0; j < i; j++) {

                lSum += arr[j];
            }
            for(int j = i + 1 ; j < N; j++) {

                rSum += arr[j];
            }

            if(lSum == rSum) {

                if(i < index) {

                    index = i;
                }
                return index;
            }   
        }

        if(index != arr.length) {

            return index;

        }
        return -1;
    }

    //     Arrays.sort(arr);
    //     System.out.println("Soted array : ");
    //     printArray(arr);
    //     int count = 0;
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i]!= arr[i - 1]) {
    //             count++;
    //         }
    //         if (count == 2) {
    //             return i;
    //         }
    //     }

    //     return -1;
    // }
    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("enter " + (i + 1) + " Element ");
            arr[i] = sc.nextInt();
        }   

        printArray(arr);
        System.out.println(" equillibrium index is : " + equillibriumIndex(arr, size));

        sc.close();
    }
}