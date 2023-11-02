import java.util.*;


public class MagitcNumber { 

    

    static int magicNumber(int num) {

        if(num == 1) {

            return 1;
        }

        if(num >= 2 && num <=9) {

            return -1;
        }
        
        int sum = 0;
        while(num > 0 ) {

            sum += (num % 10);
            num /= 10;
        }

        return magicNumber(sum);
    }
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int sum = magicNumber(num);

        if(sum == 1) {
            System.out.println(num + " is a magic number");
        }
        else {

            System.out.println(num + " is not magic number");
        }

    }
}
