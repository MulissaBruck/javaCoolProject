// Java implementation of recursive Binary Search with detailed comments

class binarySearchRecursive {
    // Recursive method for binary search
    int binarySearch(int a[], int l, int r, int x) {
        // Check if the search range is valid (r >= l)
        if (r >= l) {
            // Calculate the middle index using the safer formula to avoid overflow
            int m = l + (r - l) / 2;

            // Check if the middle element is the target
            if (a[m] == x)
                return m; // Target element found at index m

            // If target is smaller than the middle element, search in the left subarray
            if (a[m] > x)
                return binarySearch(a, l, m - 1, x);

            // If target is larger than the middle element, search in the right subarray
            return binarySearch(a, m + 1, r, x);
        }

        // If the search range becomes invalid, return -1 (element not found)
        return -1;
    }

    // Main method
    public static void main(String args[]) {
        // Create an instance of the BinarySearch class
        BinarySearch ob = new BinarySearch();

        // Input sorted array
        int a[] = { 2, 3, 4, 10, 40 };

        // Length of the array
        int n = a.length;

        // Element to search for
        int x = 10;

        // Call the binarySearch method with the entire array range (0 to n-1)
        int res = ob.binarySearch(a, 0, n - 1, x);

        // Check the result and print the appropriate message
        if (res == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + res);
    }
}
