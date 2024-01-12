import java.util.Arrays;
import java.util.Scanner;

class Merge_Sort {
    
    static void merge(int[] arr, int start , int mid, int end) {

        int l1 = mid - start + 1;
        int l2 = end - mid;

        int[] left = new int[l1];

        // copy the elements form arr to left
        for(int i = 0; i < l1; i++) {

            left[i] = arr[ start + i];
        }

        int[] right = new int[l2];

        // copy the elements from arr to right
        for(int j = 0; j < l2; j++) {

            right[j] = arr[mid + j + 1];
        }

        int i = 0;
        int j = 0; 
        int k = start;


        // Copy all the elements form both arrays
        
        while (i < l1 && j < l2) {

            if(left[i] < right[j]) {

                arr[k] = left[i];
                i++;
            }else {

                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // copy the remaining from the first array  

        while (i < l1) {

            arr[k] = left[i];
            i++;
            k++;
        }

        // copy the reamining elements form right array
        while (j < l2) {

            arr[k] = right[j];            
            j++;
            k++;
        }
    }

    static void sort(int[] arr, int start, int end) {

        if(start < end) {

            // finding the mid to get the new subarrays
            int mid = start + (end - start) / 2;

            // to devide the left subaarray till array have only one element

            sort(arr, start, mid);

            // devide the right subarray recursively till we have subarray of single element            
            sort(arr, mid + 1, end);

            // int[] left = 
            merge(arr, start, mid, end);

        }
    }

    // A helper function to print the array elemetns 
    static void printArray(int[] arr) {

        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {

            System.out.print(i == 0? arr[i]: ", " + arr[i]);
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Merge_Sort ms = new Merge_Sort();
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Before Sorting  : ");
        printArray(arr);

        int start = 0;
        int end = arr.length - 1;
        sort(arr, start, end);
        System.out.println("After sorting : ");
        printArray(arr);
    
    }
}
