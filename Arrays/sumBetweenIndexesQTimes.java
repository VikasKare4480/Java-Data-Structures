/* 
    Given an array arr and size N and Q 
    also the starting index s and ending index e 
    so find the sum between the stating and ending index 
    Q --(s, e)

*/


import java.util.*;
public class sumBetweenIndexesQTimes {

    static void sumBetIndexesQTimes(int[] arr, int N, int Q) {

        Scanner sc = new Scanner(System.in);


        for(int i = 0; i < Q; i++) {

            int sum = 0;
            System.out.print("Enter start index :");
            int s = sc.nextInt();

            System.out.print("Enter end index : ");
            int e = sc.nextInt();

            if(s < 0 || e > N -1) {

                return;
            }

            for(int j = s; j <= e ; j++) {

                sum = sum + arr[j];
                
            }
            System.out.println( "start : " + s + " end : " + e + " Sum :  " + sum);

        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Q : ");
        int Q = sc.nextInt();

        sumBetIndexesQTimes(arr, N, Q);
        sc.close();
    }
}
