import java.util.*;

public class squareRoot {

    static int squareRoot1(int num) {

        for(int i = 1; i <= num; i++) {

            if(i * i == num) {

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println(squareRoot1(num));
        sc.close();
    }
    
}
