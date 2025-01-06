public class findNeonNumber {
    public static int findNextNeon(int startNum) {
        while (true) {
            int mult = startNum * startNum;
            int sum = 0, rem;
            while (mult > 0) {
                System.out.println("First mult" + mult);
                rem = mult % 10;
                System.out.println("Reminder " + rem);
                sum += rem;
                mult = mult / 10;

            }
            System.out.println("final sum" + sum);
            if (sum == startNum) {
                return startNum;
            }
            startNum++;
        }

    }

    public static void main(String[] args) {

        int startNum = 2;

        System.out.println(findNextNeon(startNum));
    }
}
