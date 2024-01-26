import java.io.*;
import java.util.*;

class _20_pairSum {

    // static boolean pairSum1(int[] arr, int tatgetSum) {


    //     for(int i = 0; i < arr.length; i++) {

    //         for(int j = 0; j < arr.length; j++)  {

    //                 if(arr[i] + arr[j] == tatgetSum && (i != j)) {

    //                     return true;
    //                 }

    //         }
    //     }

    //     return false;

    // }

    static boolean pairSum2(int[] arr, int tatgetSum) {

        Set<Integer> seen = new TreeSet<>();

        for(int data : arr) {

            int complement = tatgetSum - data;

            if(seen.contains(complement)) {

                return true;
            }

            seen.add(data);
        }

        return false;


    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr[] = new int[N1];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter Target Sum : ");
        int tatgetSum = Integer.parseInt(br.readLine());

        boolean yes = pairSum2(arr, tatgetSum);


        if(yes) {

            System.out.println("yes it contains the target sum ");

        }else {

            System.out.println("It does not contains target sum ");
        }
        
    }
}