package Easy_;
import java.util.*;

public class _7_removeDuplicates {
 
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
    
            // Input the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
    
            int[] inputArray = new int[size];
    
            // Input the elements of the array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                inputArray[i] = scanner.nextInt();
            }
    
            // Remove duplicates and create a new array
            int[] uniqueArray = removeDuplicates(inputArray);
    
            // Print the array without duplicates
            System.out.println("Array without duplicates:");
            for (int num : uniqueArray) {
                System.out.print(num + " ");
            }
        }
    
        public static int[] removeDuplicates(int[] arr) {
            ArrayList<Integer> uniqueList = new ArrayList<>();
    
            for (int num : arr) {
                if (!uniqueList.contains(num)) {
                    uniqueList.add(num);
                }
            }
    
            int[] uniqueArray = new int[uniqueList.size()];
            for (int i = 0; i < uniqueArray.length; i++) {
                uniqueArray[i] = uniqueList.get(i);
            }
    
            return uniqueArray;
        }
}
