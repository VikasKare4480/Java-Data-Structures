import java.text.StringCharacterIterator;
import java.util.*; 

class _7_lagesetNumber_from_digit {

    static String largest_digit(int arr[]) {


        String[] strArr = new String[arr.length];
        
        for(int i =0; i < arr.length; i++) {

            strArr[i] = Integer.toString(arr[i]);

        }

        Comparator<String> customComparator = new Comparator<String>() {
            
            public int compare(String a, String b) {

                String ab = a + b;
                String ba = b + a;

                return ba.compareTo(ab);
            }
        };

        Arrays.sort(strArr, customComparator);

        StringBuilder result = new StringBuilder();

        for(String str : strArr) {

            result.append(str);
        }

        if(result.charAt(0) == '0') {

            return "0";
        }
    
        return result.toString();
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

        String large_Nunmber = largest_digit(arr);

        System.out.println(large_Nunmber);
    }
}
