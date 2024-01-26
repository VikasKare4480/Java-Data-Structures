import java.util.Scanner;

class _2_minMaxElement {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter size of arary : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1)  + " element : ");
            arr[i] = sc.nextInt();
        }

        // min and max element in given array in singe loop

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] >  max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("min and max elemtnts are " + min + " and " +  max);
        
    }
    
}

