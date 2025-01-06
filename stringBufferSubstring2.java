
public class stringBufferSubstring2 {
    public static void main(String args[]) {
        // Original string
        StringBuffer str = new StringBuffer("Geeks Gor Geeks");

        // Indices for insertion
        int index1 = 6; // Before "Gor"
        int index2 = 12; // Before second "Geeks" (space before "Geeks")

        // Print the original string
        System.out.println("Original String = " + str);

        // Insert 'F' before "Gor"
        str.insert(index1, 'F');

        // Insert 'G' before second "Geeks"
        str.insert(index2 + 1, 'G'); // Note: index2 + 1 because we inserted 'F' at index1

        // Print the modified string
        System.out.println("Modified String = " + str);
    }
}
