public class frquencyCouter3 {

    public static void countElementFrequencies(int[] arr) {

        int[] frequancyArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            frequancyArr[arr[i]]++;
        }

        for (int i = 1; i < frequancyArr.length; i++) {
            if (frequancyArr[i] > 0)
                System.out.println(i + " : " + frequancyArr[i]);

        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 2, 3 }; // Example input array
        countElementFrequencies(arr);
    }

}
