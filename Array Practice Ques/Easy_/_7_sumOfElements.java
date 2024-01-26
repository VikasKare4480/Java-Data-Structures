package Easy_;
import java.io.*;
public class _7_sumOfElements {

    static int sumOfElements(int[] arr) {

        int sum = 0;

        for(int data : arr) {

            sum += data;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
        }


        System.out.println("Sum of the " + sumOfElements(arr));
    }
    
}
