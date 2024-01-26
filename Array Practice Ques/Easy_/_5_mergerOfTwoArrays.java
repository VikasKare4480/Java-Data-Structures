package Easy_;

public class _5_mergerOfTwoArrays {
    

       
            public static void main(String[] args) {
                int[] array1 = {1, 2, 3};
                int[] array2 = {4, 5, 6};
        
                int[] mergedArray = mergeArrays(array1, array2);
        
                System.out.println("Merged Array:");
                for (int num : mergedArray) {
                    System.out.print(num + " ");
                }
            }
        
            public static int[] mergeArrays(int[] arr1, int[] arr2) {
                
                int len1 = arr1.length;
                int len2 = arr2.length;
                int mergedLen = len1 + len2;
        
                int[] mergedArray = new int[mergedLen];
        
                // Copy elements from the first array
                for (int i = 0; i < len1; i++) {
                    mergedArray[i] = arr1[i];
                }
        
                // Copy elements from the second array
                for (int i = 0; i < len2; i++) {
                    mergedArray[len1 + i] = arr2[i];
                }
        
                return mergedArray;
            }
    }

