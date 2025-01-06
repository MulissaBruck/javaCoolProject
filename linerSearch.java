// Java code for linearly searching x in arr[]. 
// If x is present, then return its location, otherwise return -1

class linearSearch {

    // Method to search for an element in the array
    static int search(int a[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) // Check if the current element matches x
                return i; // Return the index if found
        }
        // Return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        // Input array
        int[] a = { 3, 4, 1, 7, 5 };
        int n = a.length; // Get the size of the array

        int x = 4; // Element to be searched

        // Call the search method
        int index = search(a, n, x);

        // Display the result
        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}
