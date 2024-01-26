import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _40_fibaonacciInArray {


    static boolean isFibanacci(int n) {

        int firstNum = 0;
        int secNum = 1;
        int thirdNum = 0;

        while(firstNum <= n) {

            if(firstNum == n) {

                return true;
            }
            thirdNum = firstNum + secNum;
            firstNum = secNum;
            secNum = thirdNum;
        }
        return false;
    }

    static int fibonacciInArray(int[] arr, int len) {

        int count = 0;

        for(int i = 0; i < len - 1; i++) {

                if(isFibanacci(arr[i])) {

                    count++;
                }
        }
        return count;

    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr[i] = Integer.parseInt(br.readLine());
        }
       int count =  fibonacciInArray(arr, len);
        System.out.println("count is : " + count);
    }
    
}
