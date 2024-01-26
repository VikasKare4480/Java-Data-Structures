import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _39_leadersInArray {

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        
        ArrayList<Integer> al = new ArrayList<>();
      
        
            for(int i = 0; i < n; i++) {
                
                int count = 0;
                for(int j = i + 1; j < n; j++) {
                    
                    if(arr[i] >= arr[j]) {
                        
                        count = 0;
                    }
                    else {
                            
                            count++;
                            break;
                    }
                }
                if(count == 0) {
                    
                    al.add(arr[i]);
                }
            }
            return al;
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
