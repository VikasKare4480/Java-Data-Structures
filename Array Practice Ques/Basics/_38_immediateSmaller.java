import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _38_immediateSmaller {

    static void immediateSmaller(int arr[], int n) {
        // code here
        
        for(int i = 0; i < n - 1; i++) {
            
                if(arr[i + 1] < arr[i]) {
                        
                    arr[i] =  arr[i + 1];             
                }
                else{
                    
                    arr[i] = -1;
                }
         }
         arr[n - 1] = -1; 
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
        

    }
    
}
