class BinarySearch {

    // Time - 
    // at best case - O(1) Constant
    // at worst case and average case - O(logN)
    int binarySearch(int arr[], int target) {

        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        // int ptr = 1;
        while (start <= end) {

            // System.out.println(ptr++);
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target) {

                return mid;
            }
            
            if(arr[mid] < target) {

                start = mid + 1;
            }else {

                end = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        
        BinarySearch bs = new BinarySearch();
        int[] arr = {10, 20, 30, 45, 65, 78};
        int target = 65;

        int index = bs.binarySearch(arr, target);

        if(index != -1) {

            System.out.println("Element found at index : " + index);
        }else {

            System.out.println("Index is not found");
        }
    }
}
