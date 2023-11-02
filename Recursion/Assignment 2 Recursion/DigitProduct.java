
import java.util.Scanner;
public class DigitProduct {


    static int productOfDigits(int num)  {

        if(num == 0) {

            return 0;
        }

        return num % 10 + productOfDigits(num / 10);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int num = sc.nextInt();

        int productOfDigits = productOfDigits(num);
        System.out.println("factorial is : " + productOfDigits);
        sc.close();
    }
    
}
