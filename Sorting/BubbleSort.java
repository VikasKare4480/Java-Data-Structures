
/*
 * Bubble Sort ->> sort element by comaring with the other element 
 * Time -- >> O(N^2) Linear Time
 * Space -->> O(1) - Constant Space no extra space nedded 
 */

import java.io.*;

public class BubbleSort {

    void bubbleSort(int[] arr) {

        System.out.println("Wel-Come TO bubble Sort");
        int itr = 0;

        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr.length - i - 1; j++) {

                itr++;
                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            } 

            if(flag == false) {

                break;
            }
        }
        System.out.println("iterations : " + itr);
    }

    void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] +  " ") ;
        }

    }

    public static void main(String[] args)  throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BubbleSort bs = new BubbleSort();

        System.out.print("Enter size of the array : ");
        
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Before Sorting : ");
        bs.printArray(arr);

        // call to bubbleSort method
        bs.bubbleSort(arr);

        System.out.println("After Sorting : ");
        bs.printArray(arr);

    }    
}
