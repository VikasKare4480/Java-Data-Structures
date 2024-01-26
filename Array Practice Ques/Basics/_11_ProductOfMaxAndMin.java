import java.io.*;

class _11_ProductOfMaxAndMin {

    static int maxElement(int[] arr) {

        int max = arr[0];
        int len = arr.length;

        for(int i = 0; i < len; i++) {

            if(arr[i] > max) {

                max = arr[i];
            }
        }
        return max;
    }

    static int minElement(int[] arr) {

        int min = arr[0];
        int len = arr.length;

        for(int i = 0; i < len; i++) {

            if(arr[i] < min) {

                min = arr[i];
            }
        }
        return min;
    }

    static int productOfMaxAndMin(int[] arr1, int[] arr2) {

        int max = maxElement(arr1);

        int min = minElement(arr2);

        return max * min;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Size of first Array : ");
        int N1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[N1];

        for(int i = 0; i < arr1.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter Size of Second Array : ");
        int N2 = Integer.parseInt(br.readLine());
        int arr2[] = new int[N2];

        for(int i = 0; i < arr2.length; i++) {

            System.out.print("Enter " + (i + 1) + " element ");
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int product = productOfMaxAndMin(arr1, arr2);

        System.out.println("product is : " + product);

               
        
    }
    
}
