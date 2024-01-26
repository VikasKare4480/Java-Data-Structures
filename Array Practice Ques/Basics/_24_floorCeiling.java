import java.io.*;
import java.util.*;

public class _24_floorCeiling {

    static void floorCeiling(int[] arr, int x) {

        int floor = Integer.MIN_VALUE;
        int ceiling = Integer.MAX_VALUE;

        for(int num : arr) {

            if(num  <= x && num > floor) {

                floor = num;
            } 

            if(num >= x && num < ceiling) {

                ceiling = num;
            } 
        }

        if(floor == Integer.MIN_VALUE) {
            floor = -1;
        }

        if(ceiling == Integer.MAX_VALUE) {

            ceiling = -1;
        }

        System.out.println("Floor value is : " + floor);
        System.out.println("Ceiling value is : " + ceiling);

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

        System.out.print("Enter mid values between floor and Ceiling : ");
        int x = Integer.parseInt(br.readLine());

        floorCeiling(arr1, x);
    }
}
