import java.io.*;
import java.util.*;

public class _30_closestNumber {


    static int closestNumber(int[] arr, int num) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(int data : arr) {

            if(data > num && data < max) {

                max = data;

            }else if(data < num && data > min) {

                min = data;
            }
        }

        int upperClose = max - num;
        int lowerClose = num - min;

        if(upperClose > lowerClose) {

            return min;

        }else if(upperClose == lowerClose) {

            return max;

        }
       return min;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();

        }
        
        System.out.print("Enter the number to find closest : ");
        int close = sc.nextInt();

        System.out.println(closestNumber(arr,close));

        sc.close();
        
    }   
}
