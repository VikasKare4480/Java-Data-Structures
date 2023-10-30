public class REverseOrder {


    static void perintReverse(int num) {

        if(num == 1) {
            return;
        }
        perintReverse(--num);
        System.out.println(num);
    }

    public static void main(String[] args) {
        
        perintReverse(10);
    }
    
}
