import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        // 1. Creating a LinkedList
        LinkedList<String> cities = new LinkedList<>();

        // 2. Adding Elements
        cities.add("New York");
        cities.add("San Francisco");
        cities.add("Los Angeles");
        System.out.println("LinkedList after additions: " + cities); // Output: [New York, San Francisco, Los Angeles]

        // 3. Adding Elements at First and Last
        cities.addFirst("Chicago");
        cities.addLast("Miami");
        System.out.println("After adding First and Last: " + cities); // Output: [Chicago, New York, San Francisco, Los
                                                                      // Angeles, Miami]

        // 4. Accessing Elements by Index
        String firstCity = cities.get(0);
        String lastCity = cities.get(cities.size() - 1);
        System.out.println("First City: " + firstCity); // Output: Chicago
        System.out.println("Last City: " + lastCity); // Output: Miami

        // 5. Accessing First and Last Elements Directly
        System.out.println("First Element: " + cities.getFirst()); // Output: Chicago
        System.out.println("Last Element: " + cities.getLast()); // Output: Miami

        // 6. Removing Elements by Index, First, and Last
        cities.remove(2); // Removes "San Francisco"
        cities.removeFirst(); // Removes "Chicago"
        cities.removeLast(); // Removes "Miami"
        System.out.println("After removals: " + cities); // Output: [New York, Los Angeles]

        // 7. Adding Elements in Between (by Index)
        cities.add(1, "Seattle");
        System.out.println("After adding at index 1: " + cities); // Output: [New York, Seattle, Los Angeles]

        // 8. Checking if an Element Exists
        boolean hasLA = cities.contains("Los Angeles");
        System.out.println("LinkedList contains Los Angeles: " + hasLA); // Output: true

        // 9. Iterating Over Elements
        System.out.println("LinkedList elements:");
        for (String city : cities) {
            System.out.println(city);
        }

        // 10. Using LinkedList as a Queue (FIFO)
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Task1"); // Enqueue
        queue.offer("Task2");
        queue.offer("Task3");
        System.out.println("\nQueue after enqueuing tasks: " + queue); // Output: [Task1, Task2, Task3]

        String firstTask = queue.poll(); // Dequeue
        System.out.println("Dequeued Task: " + firstTask); // Output: Task1
        System.out.println("Queue after dequeuing a task: " + queue); // Output: [Task2, Task3]

        // 11. Using LinkedList as a Stack (LIFO)
        LinkedList<String> stack = new LinkedList<>();
        stack.push("Item1"); // Push
        stack.push("Item2");
        stack.push("Item3");
        System.out.println("\nStack after pushing items: " + stack); // Output: [Item3, Item2, Item1]

        String topItem = stack.pop(); // Pop
        System.out.println("Popped Item: " + topItem); // Output: Item3
        System.out.println("Stack after popping an item: " + stack); // Output: [Item2, Item1]

        // 12. Clearing the LinkedList
        cities.clear();
        System.out.println("LinkedList after clearing: " + cities); // Output: []
    }
}
