public class isSequentiallyBounded {

    public static int isSequentiallyBounded(int[] arr) {

        if (isStrictllyAscending(arr) == 1 && isFrequencyValid(arr) == 1)
            return 1;

        return 0;
    }

    public static int isStrictllyAscending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (!(arr[i] < arr[i + 1])) {

                return 0;
            }
        }

        return 1;
    }

    public static int isFrequencyValid(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    count++;
                }
            }
            if (count >= arr[i]) {

                return 0;
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        int[] array1 = { 3, 4, 5 }; // Example of a valid array
        int[] array2 = { 3, 4, 5, 5 }; // Example of an invalid array due to frequency
        int[] array3 = { 5, 5, 5 }; // Example of an invalid array due to frequency

        System.out.println("Array 1 valid: " + (isSequentiallyBounded(array1) == 1));
        // // Should print true
        System.out.println("Array 2 valid: " + (isSequentiallyBounded(array2) == 1));
        // // Should print false
        System.out.println("Array 3 valid: " + (isSequentiallyBounded(array3) == 1));
        // // Should print false

        System.out.println("Array 1 valid: " + (isFrequencyValid(array2) == 1));
        // // Should print true

    }
}