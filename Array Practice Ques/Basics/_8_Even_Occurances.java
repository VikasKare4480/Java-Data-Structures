import java.util.*;

class _8_Even_Occurances {

    static void evenOccurances(int[] arr) {

        Set<Integer> hSet = new TreeSet<>();
        for(int i = 0; i < arr.length; i++) {

            int count = 0;

            for(int j = 0; j < arr.length; j++) {

                if(arr[i] == arr[j]) {

                    count++;
                }
            } 
            if(count % 2 == 0) {
                hSet.add(arr[i]);
            } 
        }

        for(int data : hSet) {

            System.out.println(data);
        }

        return;
    }
    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);
    
        System.out.print("Enter size of arary : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1)  + " element : ");
            arr[i] = sc.nextInt();
        }

        evenOccurances(arr);

    }
}