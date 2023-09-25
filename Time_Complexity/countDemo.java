import java.util.Scanner;
import java.io.*;

class countDemo {

    static int countDemo1(int a, int b) {

        return b - a + 1;

    }
    
    static int countDemo2(int a, int b) {

        int count = 0;

        for(int i = a; i <= b; i++) {

            count++;
        }

        for(int i = b; i >= a; i--) {

            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();

        System.out.println("Enter b : ");
        int b = sc.nextInt();

        System.out.println( countDemo1(a, b));

        System.out.println(countDemo2(a, b));
    }   
}

