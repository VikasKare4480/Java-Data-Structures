import java.util.*;


public class MaxDigit {

    static int maxDigit = -1;

    static int maxDigit(int num) {

        if(num == 0) {
            return maxDigit;
        }

        if(maxDigit < num % 10) {

            maxDigit = num % 10;
        }
        return maxDigit(num / 10);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int num = sc.nextInt();

        int maxDigit = maxDigit(num);
        System.out.println("Max Digit is : " + maxDigit);
        sc.close();
    }
}
