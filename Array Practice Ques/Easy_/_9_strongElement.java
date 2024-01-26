package Easy_;

import java.io.*;
import java.util.*;

public class _9_strongElement {

    static boolean isStrong(int num) {

        int numCopy1 = num;
        int fSum = 0;

        while(num > 0) {
            
            // int rem = num % 10;

            int fact = 1;

            for(int j = 1; j <= num % 10; j++) {

                fact *= j;
            }

            fSum += fact;
            num /= 10;
        }

        if(numCopy1 == fSum) 
            return true;
    
        return false;
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

        for(int i = 0; i < arr.length; i++) {

            if(isStrong(arr[i])) {

                System.out.print(arr[i] + " ");
            }
        }
    }
}
