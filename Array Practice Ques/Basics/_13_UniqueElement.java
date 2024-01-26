import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class _13_UniqueElement {

    static int uniqueElement(int[] arr, int k) {

    
        for(int i = 0; i< arr.length; i++) {

            int count = 0;

            for(int j = 0;  j < arr.length; j++) {

                if(arr[j] == arr[i]) {

                    count++;
                }
            }

            if(count % k != 0) {
                return arr[i];
            }
        } 
        return -1;
    }
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter size of the array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr[] = new int[N1];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("Enter the K : ");
        int k = Integer.parseInt(br.readLine());

       System.out.println( uniqueElement(arr, k));
    }
    
}



// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class UniqueElement {
//     public static int findUniqueElement(int[] arr, int k) {
//         int result = 0;

//         for (int i = 0; i < 32; i++) {
//             int sum = 0;
//             int bit = 1 << i;

//             for (int num : arr) {
//                 if ((num & bit) != 0) {
//                     sum++;
//                 }
//             }

//             if (sum % k != 0) {
//                 result |= bit;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         System.out.print("Enter size of the array: ");
//         int N = Integer.parseInt(br.readLine());
//         int[] arr = new int[N];

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print("Enter element " + (i + 1) + ": ");
//             arr[i] = Integer.parseInt(br.readLine());
//         }

//         System.out.print("Enter the K: ");
//         int k = Integer.parseInt(br.readLine());

//         System.out.println(findUniqueElement(arr, k));
//     }
// }
