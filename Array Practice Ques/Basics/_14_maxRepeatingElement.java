import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _14_maxRepeatingElement {


    static int maxRepeating(int[] arr) {

        int count = 0;
        int[] count = new int[arr];

        for(int i = 0; i < arr.length; i++) {


        }
    }

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr[] = new int[N1];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr[i] = Integer.parseInt(br.readLine());
        }
    }
    
}
