import java.util.*;
import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {
        // Sample array with duplicates
        int[] givenArray = { 1, 2, 3, 1, 2, 4, 5 };

        int[] result = RemoveDuplicate(givenArray);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    static int[] RemoveDuplicate(int[] givenArray) {
        if (givenArray == null || givenArray.length == 0) {
            return givenArray;
        } else {
            int[] output = new int[givenArray.length];
            int counter = 0;

            for (int i = 0; i < givenArray.length; i++) {
                for (int j = 0; j < output.length; j++) {
                    if (givenArray[i] == output[j]) {
                        break;
                    }
                    if (j == counter) {
                        output[counter] = givenArray[i];
                        counter++;
                    }
                }
            }

            if (counter == output.length) {
                return output;
            } else {
                int[] filteredOutput = new int[counter];
                for (int x = 0; x < filteredOutput.length; x++) {
                    filteredOutput[x] = output[x];
                }
                return filteredOutput;
            }
        }
    }
}