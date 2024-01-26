import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class _12_firstLastIndex {

    static String firstLastOccurance(int[] arr, int num) {

        int firstOccurance = 0;
        int lastoccurance = 0;
        int len = arr.length;
        
        for(int i = 0; i < len; i++) {

            if(arr[i] == num) {

                firstOccurance = i;
                break;
            }       
        }

        for(int j = len - 1; j >= 0; j--) {

            if(arr[j] == num) {

                lastoccurance = j;
                break;
            }
        }

        if(firstOccurance == 0 && lastoccurance == 0) {

            return "element " + num + " not present in the arr ";
        }

        return Integer.toString(firstOccurance) + Integer.toString(lastoccurance); 
    }

    public static void main(String[] args)  throws IOException{

    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[N1];

        

        for(int i = 0; i < arr1.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Enter number to find indices : " );
        int element = Integer.parseInt(br.readLine());

        String str = firstLastOccurance(arr1, element);

        System.out.println(str);
    }
    
}
