import java.util.ArrayList;

public class insertInArraylist {
    public static void main(String[] args) {
        // Step 1: Initialize the array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);

        // Step 2: Insert 3 between 2 and 4
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 4) {
                arr.add(i, 3); // Insert 3 before 4
                break;
            }
        }

        // Step 3: Insert 6 after 5
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 5) {
                arr.add(i + 1, 6); // Insert 6 after 5
                break;
            }
        }

        // Step 4: Print the final array
        System.out.println("Updated Array: " + arr);
    }
}
