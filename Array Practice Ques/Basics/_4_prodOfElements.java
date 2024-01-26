import java.util.Scanner;

public class _4_prodOfElements {
    

    static void araryProduct(int[] arr, int mod) {

        int prod = 1;

        for(int i = 0; i < arr.length; i++) {

            prod *= arr[i];
        }

        System.out.println("Product of array element : " + prod);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter modulo");
        int mod = sc.nextInt();

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " +  (i + 1) + " element :");
            arr[i] = sc.nextInt();
        }
        araryProduct(arr,mod);
    }
    
}
