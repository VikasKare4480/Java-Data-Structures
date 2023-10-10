import java.util.Scanner;


public class findMaxUptoIndexI {
 

    static int findMaxUptoIndex(int[] arr, int N, int index) {

        int max = Integer.MIN_VALUE;
 
        for(int i = 0;  i < index; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
     //   System.out.print("Enter the elements of the array : ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index : ");
        int index = sc.nextInt();

        System.out.println(findMaxUptoIndex(arr, size, index));
    }

}
