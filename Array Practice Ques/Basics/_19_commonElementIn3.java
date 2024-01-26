import java.io.*;
import java.util.*;


public class _19_commonElementIn3 {

    static Set<Integer> commonElement(int[] arr1, int[] arr2, int[] arr3) {

        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        Set<Integer> s3 = new TreeSet<>();  
        Set<Integer> common = new TreeSet<>();


        for(int data : arr1) {

            s1.add(data);

        }
        for(int data : arr2) {

            s2.add(data);

        }
        for(int data : arr3) {

            s3.add(data);
        }

        for(int element : s1) {


            if(s2.contains(element) && s3.contains(element)) {

                common.add(element);
            }
        }
        return common;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of first Array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[N1];

        for(int i = 0; i < arr1.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter Size of Second Array : ");
        int N2 = Integer.parseInt(br.readLine());
        int arr2[] = new int[N2];

        for(int i = 0; i < arr2.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr2[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Enter Size of Third Array : ");
        int N3 = Integer.parseInt(br.readLine());
        int arr3[] = new int[N3];

        for(int i = 0; i < arr3.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr3[i] = Integer.parseInt(br.readLine());
        }

        Set<Integer> commonElemenets = commonElement(arr1, arr2, arr3);

        if(!commonElemenets.isEmpty()) {

            System.out.println("Common elements are : " + commonElemenets);

        }else {

            System.out.println(" No Common element found ");
        }   
    }
    
}
