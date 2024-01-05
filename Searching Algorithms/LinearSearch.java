class LinearSearch {

    // Best - O(1) Average and Worst O(N)
    // Space - (1) Constant

    int linearSearch(int [] arr, int target) {

        int index = -1;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == target) {

                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        LinearSearch ls = new LinearSearch();
        int[] arr = {10,34,42,54,56,67,23};
        int target = 56;

        int index = ls.linearSearch(arr, target);

        if(index != 0) {

            System.out.println("element is found at index : " + index);
        }else {

            System.out.println("Element not found ");
        }
    }
}