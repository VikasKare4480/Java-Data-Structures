import java.io.*;
import java.util.*;

class _28_removeDuplicates {

    static ArrayList<Integer> removeDuplicates(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();
        ArrayList <Integer> al = new ArrayList<>();

        for(int data : arr) {

            if(hs.add(data)) {

                al.add(data);
            }
        }

        // int i = 0;
        // int j = arr.length - 1;

        // while(i < arr.length - 1 && j >= 0) {

        
        //     if(arr[i] == arr[j]) {

        //         i++;
        //         j--;
        //     }else {

        //         al.add(arr[i]);
        //         i++;
        //         j--;
        //     }
        // }

        return al;
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

        ArrayList<Integer> al = removeDuplicates(arr1);

        System.out.println(al);
    }   
}
