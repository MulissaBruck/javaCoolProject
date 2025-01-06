package JavaBubbleListSort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create and initialize an ArrayList with some integers
        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(2);
        numberList.add(9);
        numberList.add(1);
        numberList.add(5);
        numberList.add(6);
        numberList.add(2);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numberList);

        // Call the bubbleSortList method to sort the list
        BubbleSortArray.bubbleSortList(numberList);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numberList);
    }
}
