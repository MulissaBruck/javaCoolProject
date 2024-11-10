package LinkedListProjectT;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the linked list for String type
        CustomLinkedList<String> stringList = new CustomLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        // Print the list
        System.out.println("String List: " + stringList);

        // Find an item in the list
        System.out.println("Find 'World': " + stringList.find("World"));
        System.out.println("Find 'Python': " + stringList.find("Python"));

        // Create an instance of the linked list for Integer type
        CustomLinkedList<Integer> intList = new CustomLinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        // Print the list
        System.out.println("Integer List: " + intList);

        // Find an item in the list
        System.out.println("Find 20: " + intList.find(20));
        System.out.println("Find 50: " + intList.find(50));
    }
}
