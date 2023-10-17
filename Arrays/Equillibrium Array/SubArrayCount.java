
import java.util.*;
public class SubArrayCount {
    
    static int countSubArrays(int[] arr) {

        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            for(int j = i; j < arr.length; j++) {

                count++;
            }
        }
        return count;
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

        System.out.println("Count of subarrays are : " + countSubArrays(arr));

    }
}
