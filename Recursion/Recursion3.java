package Recursion;

public class Recursion3 {


    static int fun(int num) {

        if(num == 0) {

            return 1;
        }

        num = 5 +  fun(--num);
        
        return num;
    }
    public static void main(String[] args) {

        System.out.println(fun(2));

    }
}
