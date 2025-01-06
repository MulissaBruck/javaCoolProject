// Java implementation of iterative Binary Search

class BinarySearch {
    // Binary search method
    int binarySearch(int a[], int l, int r, int x) {
        // Continue searching as long as l <= r
        while (l <= r) {
            // Find the middle index
            int m = (l + r) / 2;

            // Check if the element at the middle index matches x
            if (a[m] == x) {
                return m; // Return the index if found

                // If x is smaller than a[m], narrow the search to the left subarray
            } else if (a[m] > x) {
                r = m - 1;

                // If x is larger than a[m], narrow the search to the right subarray
            } else {
                l = m + 1;
            }
        }

        // Element not found, return -1
        return -1;
    }

    // Main driver method
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();

        // Input array (must be sorted)
        int a[] = { 2, 3, 4, 10, 40 };
        int n = a.length;

        // Element to search for
        int x = 10;

        // Perform binary search
        int res = ob.binarySearch(a, 0, n - 1, x);

        // Print the result
        if (res == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + res);
    }
}
