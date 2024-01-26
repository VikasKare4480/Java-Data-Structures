package Easy_;

import java.util.ArrayList;
import java.util.Scanner;

public class _2_commonElements {
    
    static ArrayList<Integer> commonElements(int[] arr1, int[] arr2) {

        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++) {

            for(int j = 0; j < arr2.length; j++) {

                if(arr1[i] == arr2[j]) {

                    al.add(arr1[i]);
                }
            }
        }
        return al;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1 : ");
        int s1 = sc.nextInt();
        int[] arr1 = new int[s1];

        for(int i = 0; i < s1; i++) {

            System.out.print("Enter the " + (i + 1) + " element of s1 : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array 2 : ");
        int s2 = sc.nextInt();
        int[] arr2 = new int[s2];


        
        for(int i = 0; i < s1; i++) {

            System.out.print("Enter the " + (i + 1) + " element of s2 : ");
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> al = commonElements(arr1, arr2);

        for(int data : al) {

            System.out.println(data);
        }
    }
}
