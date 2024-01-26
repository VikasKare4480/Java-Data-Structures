

// Given an integer array and another integer element. The task is to find if the given
// element is present in the array or not.

import java.io.*;
import java.util.*;

class _1 {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter size of arary : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1)  + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to Search : ");
        int n = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == n) {

                System.out.println("Element found at " + i);
                break;
            }
            if(i == arr.length - 1) {

                System.out.println("No element found ");
            }
        } 
    }
}