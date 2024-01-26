import java.io.*;
import java.util.*;

class _25_maxproductOfTwoNumbers{

    static int maxProduct(int[] arr) {

        // int maxProduct = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for(int data : arr) {

            if(data > max ) {

                secmax = max;
                max = data;
            }else if(data > secmax) {

                secmax = data;
            }
        }

        System.out.println("max  : " + max);
        System.out.println("secMax : " + secmax);

        return max * secmax;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of Array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[N1];

        for(int i = 0; i < arr1.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(maxProduct(arr1));
        
    }
}