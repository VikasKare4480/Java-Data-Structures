import java.util.Scanner;

public class _6_ProductArray {
    

    static int[] productSumArray(int[] arr, int N) {

        int[] prodArray = new int[N];

        for(int i = 0; i < N; i++) {

            int prod = 1;
            for(int j = 0; j < N; j++) {
                
                if(i == j) {
                    continue;
                }
                prod = prod * arr[j];
            }
            prodArray[i] = prod;
        }
        return prodArray;
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

        int[] prodArray = productSumArray(arr, N);

        for(int i = 0; i < prodArray.length; i++) {

            System.out.print(" " + prodArray[i]);
        }
        sc.close();
    }
}
