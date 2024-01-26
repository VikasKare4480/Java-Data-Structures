
// Bitonic point is the element has the lesses in previous index and also the lesser in next index element 
import java.io.*;
import java.util.*;

public class _36_bitonicPoint {

    static int bitonicPoint(int[] arr, int n) {

        for(int i = 1; i < n - 1; i++) {
                
            if(arr[i - 1]  < arr[i] && arr[i + 1] < arr[i]) {
                
                return arr[i];
            }
        }
    
        return arr[n- 1];

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(bitonicPoint(arr, n));
        
    }
    
}
