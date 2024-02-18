
import java.util.Scanner;

class CountOfStrongNumbersInArray {

    static int getCountofStrongNumbers(int[] arr) {

        int countOfStrongs = 0;
=
        return countOfStrongs;
    }

    static boolean isStrongNumber(int number) {

        int countOfDigits = 
        return false;
    } 

    static int getCountOfDigits(int number) {

        int digitCount = 0;

        int numCout
        while() {

            
        }
        return
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        for(int i = 0; i< size; i++) {

            System.out.println("Enter the " + (i + 1) + " element : ");
            arr[i]  = sc.nextInt();
        }

        int countOfStrongNumber = getCountofStrongNumbers(arr);
        System.out.println("Total no of strons int array are : " + countOfStrongNumber);
    }
}
