import java.util.*;

public class kthMax {
    
    static int kThMaxelement(int[] arr, int N, int k) {

        Arrays.sort(arr);
        System.out.println("Soted array : ");
        printArray(arr);

        int count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
            if (count == k) {
                return arr[i];
            }
        }
        
        return arr[0];

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

        for (int i = 0; i < size; i++) {

            System.out.print("enter " + (i + 1) + " Element ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K -- th largest element ");
        int k = sc.nextInt();

        printArray(arr);
        System.out.println(" kthMax is : " + + kThMaxelement(arr, size, k));
    }
}
