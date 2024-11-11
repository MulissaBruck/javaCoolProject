import java.util.LinkedList;
import java.util.Collections;

public class LinkdListDemo2 {
    public static void main(String[] args) {

        // 1. Creating a LinkedList of Integer type
        LinkedList<Integer> numbers = new LinkedList<>();

        // 2. Adding Elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("LinkedList after adding elements: " + numbers); // Output: [10, 20, 30, 40]

        // 3. Adding Elements at the Start and End
        numbers.addFirst(5); // Adds 5 at the beginning
        numbers.addLast(50); // Adds 50 at the end
        System.out.println("After adding first and last: " + numbers); // Output: [5, 10, 20, 30, 40, 50]

        // 4. Accessing Elements
        int firstElement = numbers.getFirst(); // Retrieves first element
        int lastElement = numbers.getLast(); // Retrieves last element
        System.out.println("First Element: " + firstElement); // Output: 5
        System.out.println("Last Element: " + lastElement); // Output: 50

        // 5. Removing Elements
        numbers.remove(2); // Removes element at index 2 (20 in this case)
        numbers.removeFirst(); // Removes first element (5)
        numbers.removeLast(); // Removes last element (50)
        System.out.println("After removals: " + numbers); // Output: [10, 30, 40]

        // 6. Checking if Element Exists
        boolean contains30 = numbers.contains(30);
        boolean contains100 = numbers.contains(100);
        System.out.println("Contains 30: " + contains30); // Output: true
        System.out.println("Contains 100: " + contains100); // Output: false

        // 7. Size of the LinkedList
        int size = numbers.size();
        System.out.println("Size of the list: " + size); // Output: 3

        // 8. Iterating Over Elements Using For-Each
        System.out.println("Iterating over the LinkedList:");
        for (Integer num : numbers) {
            System.out.println(num); // Output: 10, 30, 40
        }

        // 9. Sorting the LinkedList
        Collections.sort(numbers); // Sorts in ascending order
        System.out.println("Sorted LinkedList: " + numbers); // Output: [10, 30, 40]

        // 10. Reversing the LinkedList
        Collections.reverse(numbers); // Reverses the order
        System.out.println("Reversed LinkedList: " + numbers); // Output: [40, 30, 10]

        // 11. Using LinkedList as a Queue (FIFO)
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Task 1"); // Enqueue
        queue.offer("Task 2");
        queue.offer("Task 3");
        System.out.println("\nQueue after enqueuing tasks: " + queue); // Output: [Task 1, Task 2, Task 3]

        String firstTask = queue.poll(); // Dequeue
        System.out.println("Dequeued Task: " + firstTask); // Output: Task 1
        System.out.println("Queue after dequeuing a task: " + queue); // Output: [Task 2, Task 3]

        // 12. Using LinkedList as a Stack (LIFO)
        LinkedList<String> stack = new LinkedList<>();
        stack.push("Item A"); // Push onto stack
        stack.push("Item B");
        stack.push("Item C");
        System.out.println("\nStack after pushing items: " + stack); // Output: [Item C, Item B, Item A]

        String topItem = stack.pop(); // Pop from stack
        System.out.println("Popped Item: " + topItem); // Output: Item C
        System.out.println("Stack after popping an item: " + stack); // Output: [Item B, Item A]

        // 13. Clearing the LinkedList
        numbers.clear();
        System.out.println("LinkedList after clearing: " + numbers); // Output: []
    }
}
