import java.io.*;

class _3_largestElement {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        System.out.print("Enter size of the aay : ");
        int n  = Integer.parseInt(br.readLine());

        int A[] = new int[n];

        int largest = A[0];

        for(int i = 0; i < A.length; i++) {

            if(A[i] > largest) {

                largest = A[i];
            }
        }

        System.out.println("largest element in the given array is : " + largest);

    }
    
}
