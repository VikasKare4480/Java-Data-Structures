import java.util.*;


public class LenghtOfDigits {
    
    static int digits = 0;
    static int digitsAre(int num) {

        if(num == 0) {

            return 0;
        }   

        digits++;
        num /= 10;
        digitsAre(num);

        return digits;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");

        int num = sc.nextInt();

        System.out.println(digitsAre(num));    
        sc.close();
    }
}
