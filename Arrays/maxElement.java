/*
 * 
 * finding the max element form the array given
 * Time : O(N) -->> Linear Time
 * Space : O(1) -->> Contant Time
 */
import java.util.*;
public class maxElement {
    
    static int maxElement1(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxElement = maxElement1(arr);

        System.out.println("Maximum element is : " + maxElement);
        sc.close();
    }
}