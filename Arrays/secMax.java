import java.util.Scanner;

public class secMax {

    static int secMaxElement(int[] arr, int N) {

        int max = Integer.MIN_VALUE;    
        int secMax = max;

        int i = 0;
        while(i < N) {

            if(arr[i] > max) {
                
                secMax = max;
                max = arr[i]; 
            }
            i++;
        }

        return secMax;
    }

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
        // System.out.print("Enter the elements of the array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        System.out.println(" secMax is : " + + secMaxElement(arr, size));
        sc.close();
    }
    
}
