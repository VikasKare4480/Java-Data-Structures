import java.util.Scanner;

public class _5_PrefixSum {
    

    static int[] prefixSumArray(int[] arr, int N) {

        int[] psArray = new int[N];

        psArray[0] = arr[0];

        for(int i = 1; i < N ; i++) {

            arr[i] = arr[i] + arr[i - 1];
        }

        return psArray;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {

            
            System.out.print("Enter " + (i + 1) + " Elemenet ");
            arr[i] = sc.nextInt();
        }

        int[] psArray = prefixSumArray(arr, N);

        for(int i = 0; i < psArray.length; i++) {

            System.out.print(" " + arr[i]);
        }
    }
}
