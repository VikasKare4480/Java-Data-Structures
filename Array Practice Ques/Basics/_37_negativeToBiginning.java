import java.io.*;
import java.util.*;

public class _37_negativeToBiginning {

    static int[] negativeToBiginning(int[] arr, int len) {

        int j = 0; 
        // int y = len - 1;

        for(int i = 0; i < len - 1; i++) {

            if(arr[i] < 0) {

                if(i != j) {

                    int copy = arr[i];
                    arr[i] = arr[j];
                    arr[j] = copy;
                }
                j++;
            }
        }
        return arr;
    }    

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] ret = negativeToBiginning(arr, len);

        for(int element : ret) {

            System.out.println(element);
        }
    }
}
