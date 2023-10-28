package Recursion;


public class Recursion2 {


    static void fun(int num) {

        if(num == 0)
            return;

        fun(--num);
        System.out.println(num);
    }

    public static void main(String[] args) {

        System.out.println("Star Main");
        fun(2);
        System.out.println("End Mian");
    }
    
}
