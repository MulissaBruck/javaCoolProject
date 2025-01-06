import java.util.Arrays;

public class findFibonacciSeries {
    public static int[] fibonTh(int seriesTh) {

        int[] fibon = new int[seriesTh];
        int index = 2, currSum = 1, prevSum = 0, sum = 0;
        fibon[0] = 0;
        fibon[1] = 0;
        fibon[2] = 1;
        for (int i = 3; i < seriesTh; i++) {

            // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ……

            sum = currSum + prevSum;
            fibon[index++] = sum;
            System.out.println(fibon[index]);
            prevSum = currSum;
            currSum = sum;
        }

        return fibon;
    }

    public static void main(String[] args) {

        int seriesTh = 23;

        System.out.println(Arrays.toString(fibonTh(seriesTh)));
    }
}
