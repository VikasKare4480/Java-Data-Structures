import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23_smallestSsmallest {

    static void smallestSecSmallest(int[] arr) {    

        int smallest = Integer.MAX_VALUE;

        // System.out.println(smallest);
        int secSmallest = Integer.MIN_VALUE;
        // System.out.println(secSmallest);

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < smallest) {

                secSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secSmallest && arr[i] != smallest) {

                secSmallest = arr[i];
            }

            
        }

        System.out.println("Smallest : " + smallest);
        System.out.println("Second Smallest : " + secSmallest);
    }

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of first Array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[N1];

        for(int i = 0; i < arr1.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr1[i] = Integer.parseInt(br.readLine());
        }

        smallestSecSmallest(arr1);
    }
    
}
