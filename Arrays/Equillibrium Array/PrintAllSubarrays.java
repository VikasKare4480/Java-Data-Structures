

import java.util.*;
public class PrintAllSubarrays {


    static void printAllSubarrays(int[] arr, int N) {

        for(int i = 0; i < N; i++) {

            for(int j = i; j < N; j++) {

                for(int k = i; k <= j; k++) {

                    if(k != j) 
                        System.out.print(arr[k] + ",");
                    else 
                        System.out.print(arr[k]);
                }
                System.out.println();
            }
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

        printAllSubarrays(arr, size);
    }
}
