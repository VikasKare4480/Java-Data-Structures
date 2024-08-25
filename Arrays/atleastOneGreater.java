import java.util.*;

public class atleastOneGreater {

    static int _1_atleastOneGreater(int[] arr, int N) { 

        int count = 0;
        int itr = 0;

        // O(N2)
        for(int i = 0; i < N; i++) {

            for(int j = 0; j < N; j++) {
                itr++;
                if(arr[i] > arr[j]) {

                    count++;
                    break;
                }
            }
        }

        System.out.println("itr1 : " + itr);
        return count;
    }


    // O(N)
    static int _2_optimised(int[] arr, int N) {

        // int count = 0;
        // int itr = 0;

        // find largest element 
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {

            if(arr[i] > max) {

                max = arr[i];
            }
        }

        // total - Count(max) = ans

        // count max in array 

        int maxCount = 0; 

        for(int i = 0; i < N; i++) {

            if(arr[i] == max) {

                maxCount++;
            }
        }

        return N - maxCount;


    }

    static  int _3_arrayList(int[] arr, int N) {

        int count = 0;

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < N; i++) {

            if(al.contains(arr[i])) {

                continue;
            }else {

                al.add(arr[i]);

                for(int j = 0; j < N; j++) {

                    if(arr[i] > arr[j]) {
                        count++;
                        break;
                    }
                }
                
            }
        } 

        return count;
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count1 = _1_atleastOneGreater(arr, size);
        System.out.println("Count1 is : " + count1);

        int count2 = _2_optimised(arr, size);
        System.out.println("Count2 : " + count2);

        int count3 = _3_arrayList(arr, size);
        System.out.println("Count3 : " + count3);
        sc.close();
    }   
}
