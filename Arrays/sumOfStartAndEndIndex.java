/*
 * Time -->> O(N)
 * Space -->> O(1)
 */
import java.util.*;
public class sumOfStartAndEndIndex {
    

    static int sumBetweenStartAndEndIndex(int[] arr, int N, int s, int e) {

        if(s < 0 && e > arr.length) {

            System.out.println("Check start and end indexes ");
            return 0;
        }
        
        int sum = 0;

        for(int i = 0; i < N; i++) {

            if(i >=s && i <= e) {

                    sum += arr[i];
            }
         }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter start index :");
        int s = sc.nextInt();

        System.out.print("Enter end index : ");
        int e = sc.nextInt();

        int sum = sumBetweenStartAndEndIndex(arr, N, s, e);
        System.out.println("Sum : " + sum);

        sc.close();
    }
}
