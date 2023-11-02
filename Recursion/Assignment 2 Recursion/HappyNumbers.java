
import java.util.Scanner;


public class HappyNumbers {
    
    static int happyNumber(int num)  {

        if(num == 1 || num == 4) {

            return num;
        }

        int sum = 0;
        
        while (num > 0) {
            
            int rem = num % 10;
            sum += (rem * rem);
            num /= 10;
        }
        return happyNumber(sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        int sum = happyNumber(num);
        System.out.println(sum);

        if(sum == 1) {

            System.out.println(num + " is magic number");
        }
        else {

            System.out.println(num + " is not a magic number");
        }
    }
}
