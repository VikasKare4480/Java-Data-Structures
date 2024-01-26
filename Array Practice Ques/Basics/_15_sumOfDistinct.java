import java.util.*;
import java.io.*;

class _15_sumOfDistinct {


    static int sumOfDistinct(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();

        // contains only distinct elements

        for(int element : arr) {

            hs.add(element);
        }

        int sum = 0;

        for(int element : hs) {

            sum += element;
        }
        return sum;
    }

    public static void main(String[] args)  throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr[] = new int[N1];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Sum of Distinct element is : " + sumOfDistinct(arr));
    }
}