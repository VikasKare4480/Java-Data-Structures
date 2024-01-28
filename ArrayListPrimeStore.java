
import java.util.ArrayList;
import java.util.Scanner;
class ArrayListEcample {

    static ArrayList<Integer> storePrimes(int num1, int num2) {

        ArrayList<Integer> al = new ArrayList<>();

        for(int i = num1; i <= num2; i++) {

            if(isPrime(i)) {

                al.add(i);  

            }
        }
        return al;
    }

    static boolean isPrime (int num) {

        int factors = 0;

        for(int i = 1; i <= num; i++) {

            if(num % i == 0) {

                factors++;
            }
        }
        if(factors == 2) {

            return true;
        }
        return false;
    }

    // helper function to print the arrayList

    static void printList(ArrayList<Integer> al) {

        for(int num : al) {

            System.out.print(num + " ");
        }
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start : ");
        int start = sc.nextInt();

        System.out.println("Enter End : ");
        int end = sc.nextInt();

        ArrayList<Integer> al = storePrimes(start, end);
        printList(al);
        sc.close();
    }
}