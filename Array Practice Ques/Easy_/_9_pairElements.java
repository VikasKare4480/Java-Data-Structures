package Easy_;

import java.util.HashMap;
import java.io.*;

public class _9_pairElements {
 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        System.out.println("Enter target sum : ");
        int targetSum = Integer.parseInt(br.readLine());

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        findPairWithSum(arr, targetSum);
    }

    public static void findPairWithSum(int[] arr, int targetSum) {


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];

            if (map.containsKey(complement)) {
                int complementIndex = map.get(complement);
                System.out.println("Pair found at index " + complementIndex + " and index " + i);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found with the given sum.")
    }

}