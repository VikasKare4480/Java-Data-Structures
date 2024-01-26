
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _43_betweenTwoElements {

        static int getCount(int arr[], int n, int num1, int num2) {
            int num1Index = -1;
            int num2Index = -1;
        
            for (int i = 0; i < n; i++) {
                if (arr[i] == num1) {
                    num1Index = i;
                    break;
                }
            }
        
            for (int j = n - 1; j >= 0; j--) {
                if (arr[j] == num2) {
                    num2Index = j;
                    break;
                }
            }
        
            if (num1Index != -1 && num2Index != -1) {
                return Math.abs(num2Index - num1Index) - 1;
            } else {
                return -1; // Indicate that either num1 or num2 was not found in the array
            }
        }
        
    

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Enter first number : ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter second element : ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("numbers Between are : " + getCount(arr, len, num1, num2));

    }
    
}
