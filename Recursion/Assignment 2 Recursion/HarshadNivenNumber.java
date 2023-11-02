import java.util.Scanner;


public class HarshadNivenNumber {

    static int sum = 0;
    static int harshadNumber(int num) {

        if(num == 0)  {
            return 0;
        }

        return num % 10 + harshadNumber(num / 10);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        int isHarshad = harshadNumber(num);
        
        if(num % isHarshad == 0) {

            System.out.println(num + " is Harshad number");
        }   
        else {

            System.out.println(num + " is not Harshad number");
        }
    }
}
