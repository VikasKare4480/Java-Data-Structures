import java.io.*;
import java.util.*;

public class _41_countriesAtWar {

    static String Country_at_war(int[] arr, int[] brr, int n) {

        int acount = 0;
        int bcount = 0;

            int i = 0;

            while( i < n) {

                if(arr[i] > brr[i]) {

                    acount++;
                }
                else if(arr[i] < brr[i]) {

                    bcount++;
                }
                else if(arr[i] == brr[i]) {

                    acount++;
                    bcount++;
                }                
            i++;
            }

            if(acount > bcount) {

                return "A";

            }else if(bcount > acount) {

                return "B";
            }
        return "DRAW";
    }
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        System.out.println("Enter for A : ");
        for(int i = 0; i < len; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] brr = new int[len];

        System.out.println("Enter for B : ");
        for(int i = 0; i < len; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            brr[i] = Integer.parseInt(br.readLine());
        }

        
        System.out.println("Winner Country is : " + Country_at_war(arr, brr, len));
    }

}
