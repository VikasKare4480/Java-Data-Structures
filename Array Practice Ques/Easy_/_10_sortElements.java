package Easy_;
import java.io.*;
import java.util.*;

public class _10_sortElements {

    static int[] sortArray(int[] arr) {

        Arrays.sort(arr);

        return arr;
        
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
        
        Arrays.sort(arr);

        System.out.println("_10_sortElements.main()");

        for(int element : arr) {

          System.out.print(element + " ");
            
        }
    }
    
}
