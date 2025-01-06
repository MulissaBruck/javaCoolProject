
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListInitializationExamples {
    public static void main(String[] args) {
        // 1. Immutable List Initialization
        // Using Collections.singletonList
        List<Integer> singletonList = Collections.singletonList(2);
        System.out.println("Singleton List: " + singletonList);

        // Using Collections.unmodifiableList
        List<Integer> unmodifiableList = Collections.unmodifiableList(Arrays.asList(1, 2, 3));
        System.out.println("Unmodifiable List: " + unmodifiableList);

        // Using List.of (Java 9+)
        List<Integer> listOf = List.of(1, 2, 3);
        System.out.println("List.of: " + listOf);

        // Using Stream + CollectingAndThen for immutability
        List<Integer> immutableList = Stream.of(1, 2, 3, 4)
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println("Immutable List via Stream: " + immutableList);

        // 2. Dynamic/Mutable List Initialization
        // Using new ArrayList with Arrays.asList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("ArrayList: " + arrayList);

        // Using Collections.addAll
        List<Integer> addAllList = new ArrayList<>();
        Collections.addAll(addAllList, 1, 2, 3, 4);
        System.out.println("List with Collections.addAll: " + addAllList);

        // Using Stream + Collectors.toList
        List<Integer> streamList = Stream.of(1, 2, 3)
                .collect(Collectors.toList());
        System.out.println("List via Stream + Collectors.toList: " + streamList);

        // Using Stream + Collectors.toCollection
        List<Integer> toCollectionList = Stream.of(1, 2, 3)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("List via Stream + Collectors.toCollection: " + toCollectionList);

        // Inline Initialization with Anonymous Class
        List<Integer> inlineList = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        System.out.println("Inline Initialized List: " + inlineList);

        // 3. Specialized List Implementations
        // Using LinkedList
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));
        System.out.println("LinkedList: " + linkedList);

        // Using Stack
        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1, 2, 3));
        System.out.println("Stack: " + stack);

        // Using Collections.EMPTY_LIST
        List<Integer> emptyList = Collections.EMPTY_LIST;
        System.out.println("Empty List: " + emptyList);

        // 4. Java 9+ Factory Methods
        // List.of (Immutable)
        List<String> strings = List.of("One", "Two", "Three");
        System.out.println("List.of for Strings: " + strings);
    }
}
