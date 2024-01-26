import java.io.*;
import java.util.*;

public class _26_positiveAndNegetive {

    static ArrayList<Long> positiveAndNegetive(Long[] arr,int n) {

        ArrayList<Long> al = new ArrayList<>();
        List<Long> positive = new ArrayList<>();
        List<Long> negative = new ArrayList<>();
        for(long data : arr) {

            if(data > 0) {

                positive.add(data);

            }else {

                negative.add(data);
            }
        }

        int i = 0;
        int j = 0;
        // int k = 0;

        while(i < positive.size() && j < negative.size()) {
            al.add(positive.get(i++));
            al.add(negative.get(j++));
        }

        while(i < positive.size()) {

            al.add(positive.get(i));
        }

        while(j < negative.size()) {

            al.add(negative.get(j));
        }
        return al;
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of Array : ");
        int N1 = Integer.parseInt(br.readLine());
        Long arr1[] = new Long[N1];

        for(int i = 0; i < arr1.length; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr1[i] = Long.parseLong(br.readLine());
        }

        ArrayList<Long> al = positiveAndNegetive(arr1, N1);

        for(Long data : al) {

            System.out.println(data + " ");
        }
    }
}
