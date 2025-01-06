import java.util.Arrays;

public class findaArmstrongNo {
    public static int[] findArmstrong(int num1, int num2) {

        int[] armstrong = new int[10];
        int index = 0;
        for (int i = num1; i <= num2; i++) {
            int num = 0, sum = 0;
            int n = i;
            System.out.println(n);
            while (n > 0) {
                num = n % 10;
                num = num * num * num;
                sum += num;
                n = n / 10;
            }
            if (sum == i) {
                // System.out.print(sum);
                armstrong[index++] = sum;

            }
        }

        return armstrong;
    }

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 500;

        System.out.println(Arrays.toString(findArmstrong(num1, num2)));

    }
}
