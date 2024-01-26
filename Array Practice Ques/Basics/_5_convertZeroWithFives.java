
import java.util.Scanner;

class replaceZeroWithFives {

    static int replcenumbers(int num) {


        // convertimg the integer to the string 
        String str = Integer.toString(num);

        // replace those numbers 
        str = str.replace("0", "5");

        // converting back to the Integer
        num = Integer.parseInt(str);

        return num;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int reaplced = replcenumbers(num);
        System.out.println(reaplced);
    }
    
}

