package Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {

    int partition(int[ ]arr, int start, int end) {

        int pivote = arr[end];
        int i = start - 1;

        for(int j = start; j < end; j++) {

            if(arr[j] >= pivote) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

            int temp = arr[i + 1];
            arr[i + 1] = arr[end];
            arr[end] = temp;

            return i + 1;
    }

    void mergeSort(int[] arr, int start, int end) {

        if(start < end) {

            int pivoteIndex = partition(arr, start, end);

            mergeSort(arr, start, pivoteIndex - 1);

            mergeSort(arr, pivoteIndex + 1, end);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        MergeSort ms = new MergeSort();
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        ms.mergeSort(arr,start, end);

        System.out.println(Arrays.toString(arr));

    }    
}
