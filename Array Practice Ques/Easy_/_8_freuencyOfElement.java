package Easy_;
import java.io.*;
import java.util.*;


public class _8_freuencyOfElement {

    static int freuencyOfElement(int[] arr, int num) {

        int count = 0; 

            for(int i = 0; i < arr.length; i++) {

                if(num == arr[i]) {

                    count++;
                }
            }      
        

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        Set<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
            hs.add(arr[i]);
        }
        
        for(int data : hs) {

            System.out.println("Frequency of the " + data + " is " + freuencyOfElement(arr, data));
        }
    }
}
