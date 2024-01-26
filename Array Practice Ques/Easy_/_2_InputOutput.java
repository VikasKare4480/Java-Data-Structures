package Easy_;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2_InputOutput {
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int data : arr) {
            
            System.out.print(data + " ");
        }
    }
}
