import java.io.*;
import java.util.*;

class _33_leftRight {

    static int multLeftRrite(int[] arr) {

        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < arr.length; i++ ) {

            if(i <= arr.length / 2 - 1) {

                leftSum += arr[i];

            }else {

                rightSum += arr[i];
            }
        }
        System.out.println(leftSum);
        System.out.println(rightSum);
        return leftSum * rightSum;
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

        System.out.println(multLeftRrite(arr));
    }
}