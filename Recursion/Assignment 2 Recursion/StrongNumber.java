import java.util.*;

public class StrongNumber { 


    static int strongSum = 0;

    
    static int factorial(int num) {
        
        if(num == 0) {

            return 1;
        }
        return num *  factorial(num - 1); 
    }

    static int strongNumber(int num) {

        if(num == 0) {

            return strongSum;
        }
        strongSum = strongSum +  factorial(num % 10);

        
        
        return strongNumber(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int num = sc.nextInt();
        int copy = num;

        int isStrong = strongNumber(num);

        if(isStrong == copy) {

            System.out.println(isStrong + " is strong number");
        }else  { 


            System.out.println(isStrong + " is not strong number");
        }
    }

}
