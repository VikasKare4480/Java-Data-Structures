/*
 * 
 * Given an chracter array needs to find the pairs of the count with 
 * start a and end g (Reverse is not alloews like g and then a)
 */


 // Time -->> O(N)
 // Space -->> O(1)

import java.util.*;


public class agPairCount {

    static int agCharPairCount(char[] arr, int N, char a, char g) {

        int pairCount = 0;
        int countA = 0;

        for(int i = 0; i < N; i++) {

            if(arr[i] == a) {

                countA++;
                
            } else if(arr[i] == g) {

                pairCount += countA;
            }
        }
        return pairCount;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :  ");
        int size = sc.nextInt();

        char[] arr = new char[size];
    
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("Enter first Character : ");
        char a = sc.next().charAt(0);

        System.out.println("Enter end character : ");
        char g = sc.next().charAt(0);

        int pairCount = agCharPairCount(arr, size, a, g);
        System.out.println(pairCount);

        sc.close();
    }

}
