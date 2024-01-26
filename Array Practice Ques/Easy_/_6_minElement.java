package Easy_;
import java.io.*;
public class _6_minElement {

    static int minElement(int[] arr) {

        int minElement = Integer.MAX_VALUE;

        for(int data : arr) {

            if(data < minElement) 
                minElement = data;
        }

        return minElement;
    }

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Min element is : " + minElement(arr));
    }
    
}
