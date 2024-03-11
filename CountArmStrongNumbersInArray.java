class CountOfArmStrongNumbersInArray {

    static int getCountOfArmstrongNumbers(int[] arr) {
        int countOfArmstrongs = 0;

        for (int index = 0; index < arr.length; index++) {
            if (isArmstrongNumber(arr[index])) {
                countOfArmstrongs++;
            }
        }
        return countOfArmstrongs;
    }

    static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numberOfDigits = (int) Math.log10(number) + 1;
        int armstrongChecker = 0;

        while (number > 0) {
            int digit = number % 10;
            armstrongChecker += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return originalNumber == armstrongChecker;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 145, 40585, 1454};

        int countOfArmstrongNumbers = getCountOfArmstrongNumbers(arr);
        System.out.println("Total number of Armstrong numbers in the array: " + countOfArmstrongNumbers);
    }
}
