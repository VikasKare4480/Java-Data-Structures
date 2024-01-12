// package Sorting;
/*
 * Selection Sort :  select a min element from the rigth of the thar element from hte array 
 * and place to the ith position 
 * Time :  O(N^2)
 * Space : O(1)
 */

import java.util.Scanner;

public class SelectionSort {

    void selectionSort(int[] arr) {

        
        for(int i = 0; i < arr.length - 1; i++)  {

            int min = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[min]) {

                    min = j;
                }
            }

           if(i != min) {

                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
           }
        }

    
    }
    void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] +  " ") ;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SelectionSort ss = new SelectionSort(); 


        System.out.print("Enter size of Arrar : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        ss.selectionSort(arr);

        System.out.println("After Sorting : ");
        ss.printArray(arr);

    }
}
