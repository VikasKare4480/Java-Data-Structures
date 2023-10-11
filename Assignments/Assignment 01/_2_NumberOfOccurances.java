
import java.util.Scanner;


public class _2_NumberOfOccurances {

    static int occuranceCount(int[] arr, int N, int B) {

        int count = 0;

        for(int i = 0; i <  N; i++) {

            if(arr[i] == B) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " Elemenet ");
            arr[i] = sc.nextInt();
        }  
        

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Enter the arr elements to find Frequency : ");
        int B = sc.nextInt();

        System.out.println("Number of Occurances : " + occuranceCount(arr, size, B));
    }
}
