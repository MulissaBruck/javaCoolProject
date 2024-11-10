import java.util.Scanner;

public class isLegalNumber {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the length of the array
        System.out.println("Enter the length of the array:");
        int length = input.nextInt();

        // Initialize the array based on the input length
        int[] array = new int[length];

        // Read elements of the array from user input
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = input.nextInt();
        }

        // Prompt user to enter the base number
        System.out.println("Enter the base number:");
        int base = input.nextInt();

        // Check if all elements are less than or equal to the base number
        int result = isLegalNumber(array, base);
        System.out.println("The result is: " + result);

        // Close the scanner
        input.close();
    }

    public static int isLegalNumber(int[] array, int base) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] > base) {
                return 0; // Return 0 if any element is greater than the base number
            }
        }
        return 1; // Return 1 if all elements are less than or equal to the base number
    }
}
