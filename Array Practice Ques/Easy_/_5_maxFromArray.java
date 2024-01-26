package Easy_;
import java.io.*;

class _5_maxFromArray {

    static int maxElement(int[] arr) {

        int maxElement = Integer.MIN_VALUE;

        for(int data : arr) {

            if(data > maxElement) 
                maxElement = data;
        }

        return maxElement;
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
        
        System.out.println("Max element is : " + maxElement(arr));
        
    }
}