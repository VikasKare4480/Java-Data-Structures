import java.util.*;

/*
 * Time -->> O(N)
 * Space -->> O(1)
 */
public class pairSumK {

    static int pairSum(int[] arr, int N, int K) {

        int count = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
               
                if(i != j && (arr[i] + arr[j] == K)) {

                        count++;
               }
            }
        }

        return count;
    }    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Taget sum : ");
        int k = sc.nextInt();
        int paircount =   pairSum(arr, size, k);
        System.out.println(paircount);
    }
}
