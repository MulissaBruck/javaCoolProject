public class GFG {
    public static void main(String args[]) {
        // Original string
        String str = "Geeks Gor Geeks";

        // Indices for insertion
        int index1 = 6; // Before "Gor"
        int index2 = 13; // Before second "Geeks"

        // Print the original string
        System.out.println("Original String = " + str);

        // Insert 'F' before "Gor" and 'G' before second "Geeks"
        str = str.substring(0, index1) + 'F' + str.substring(index1); // Add 'F' before "Gor"
        str = str.substring(0, index2 + 1) + 'G' + str.substring(index2 + 1); // Add 'G' before second "Geeks"

        // Print the modified string
        System.out.println("Modified String = " + str);
    }
}
