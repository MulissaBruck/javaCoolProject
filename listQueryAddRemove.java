import java.util.*;

public class listQueryAddRemove {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the initial number of elements in the list
        System.out.print("Enter the initial number of elements in the list: ");
        int n = scanner.nextInt();

        // Step 2: Read the initial elements of the list
        System.out.println("Enter the elements of the list:");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Step 3: Read the number of queries
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();

        // Step 4: Process each query
        for (int i = 0; i < q; i++) {
            System.out.println("Enter the query type (Insert/Delete):");
            String queryType = scanner.next();

            if (queryType.equals("Insert")) {
                System.out.println("Enter the index and value to insert:");
                int index = scanner.nextInt();
                int value = scanner.nextInt();

                if (index >= 0 && index <= list.size()) {
                    list.add(index, value); // Insert the value at the specified index
                } else {
                    System.out.println("Invalid index for Insert operation. Skipping.");
                }
            } else if (queryType.equals("Delete")) {
                System.out.println("Enter the index to delete:");
                int index = scanner.nextInt();

                if (index >= 0 && index < list.size()) {
                    list.remove(index); // Remove the value at the specified index
                } else {
                    System.out.println("Invalid index for Delete operation. Skipping.");
                }
            } else {
                System.out.println("Invalid query type. Skipping.");
            }
        }

        // Step 5: Print the modified list as a single line of space-separated integers
        System.out.println("Modified list:");
        for (int value : list) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
}
