import java.io.*;
import java.util.*;


class _27_countPairSum {

    static int countPairSum(int[] arr1, int[] arr2, int sum) {

        int count = 0;

        // O(N*N) --->> 

        // for(int i = 0 ; i < arr1.length; i++) {

        //     for(int j = 0; j < arr2.length; j++) {

        //         if((arr1[i] + arr2[j]) == sum) {

        //             count++;
        //         }

        //     }
        // }

        ArrayList<Integer> al = new ArrayList<>();

        for(int data : arr2) {

            al.add(data);
        }

        for(int data1 : arr1) {

            if(al.contains(sum - data1)) {

                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of Array : ");
        int s1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[s1];

        for(int i = 0; i < arr1.length; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr1[i] = Integer.parseInt(br.readLine());
        }   

        System.out.print("Enter size of second Array : ");
        int s2 = Integer.parseInt(br.readLine());

        int[] arr2 = new int[s2];

        for(int i = 0; i < arr2.length; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr2[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Enter count sum : ");
        int sum = Integer.parseInt(br.readLine());

        System.out.println("Count : " + countPairSum(arr1, arr2, sum));
        
    }
    
}
