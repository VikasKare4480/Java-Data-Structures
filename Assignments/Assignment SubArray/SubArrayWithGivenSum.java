import java.util.Scanner;

public class SubArrayWithGivenSum {
    
    static int[] subArrayWithGivenSum(int[] arr, int K) {

        int[] result = new int[2];
        for(int i = 0; i < arr.length; i++) {

            int sum = 0;
            int j;
            for(j = i; j < arr.length; j++) {

                sum = sum + arr[j];
            }   

            if(sum == K) {

                result[0] = i + 1;
                result[1] = j + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");

        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum : ");
        int K = sc.nextInt();

        int[] result = subArrayWithGivenSum(arr, K);
        

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
