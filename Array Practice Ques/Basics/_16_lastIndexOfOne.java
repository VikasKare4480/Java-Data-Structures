import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16_lastIndexOfOne {


    static int lastIndexOfOne(String str) {

        for(int i = str.length() - 1; i >= 0; i--) {

            if(str.charAt(i) == '1') {

                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String of 0s and 1s : ");
        String str = br.readLine();

        int lastIndex = lastIndexOfOne(str);
        System.out.println("last index of 1 is : " + lastIndex);
        
    }


    
}
