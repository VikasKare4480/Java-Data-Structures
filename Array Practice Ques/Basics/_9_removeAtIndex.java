import java.util.ArrayList;
import java.util.Scanner;

public class _9_removeAtIndex {


    static int[] deleteAtIndex(int[] arr, int index)  {

        if(index < 0 || index >= arr.length) {

            System.out.println("Invalid Index");
            return arr;
        }

        int newArr[] = new int[arr.length - 1];

        int newIndex = 0;

        for(int i = 0; i < arr.length; i++) {

            if(i != index) {

                newArr[newIndex] = arr[i];
                newIndex++;
            }
         }
         return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        
        System.out.print("Enter size of arary : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1)  + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index to which element is to remove : ");
        int index = sc.nextInt();

        int newArr[] = deleteAtIndex(arr, index);

        for(int data : newArr) {

            System.out.println(data);

        }

    }
    
}
