
import java.util.*;

public class _7_leaderNumbe {

    public static ArrayList<Integer> leaderNumber(int[] arr, int N) {

        ArrayList<Integer> al = new ArrayList<>();

        // int max = Integer.MIN_VALUE;


        // O(N^2)

        // for(int i = 0; i < N; i++) {

        //     for(int j = i + 1; j < N; j++) {

        //         if(arr[i] > arr[j]) {

        //             continue;
        //         }  
        //     }     
        // }
        // al.add(arr[N -1]);

        // O(N)

        ArrayList<Integer> al1 = new ArrayList<>();

        al1.add(N - 1);

        int max = arr[N - 1];
        for(int i = N - 2; i >= 0; i--) {

            if(arr[i] > max) {

                max = arr[i];
                al1.add(arr[i]);
            }
        }

        // add revesed list to get in the same order


        ArrayList<Integer> reversedList = new ArrayList<>();

        for(int i = al1.size() - 1; i >= 0; i--) {

                reversedList.add(al1.get(i));
        }


        return reversedList;
    }
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {

            System.out.print("Enter " + (i + 1) + " Elemenet ");
            arr[i] = sc.nextInt();
        }

        System.out.println(leaderNumber(arr, N));
    }  
}
