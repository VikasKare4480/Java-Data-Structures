

public class PrintOnetoTen {

    static void printOnetoTen(int num) {

        if(num == 11) {

            return;
        }

        System.out.println(num);
        printOnetoTen(++num);
    }
    public static void main(String[] args) {
        printOnetoTen(1);
    }  
}
