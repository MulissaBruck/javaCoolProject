public class calculateComInterst2 {

    /*
     * Compound Interest = P(1 + R/100)t
     * 
     * Where,
     * 
     * P is principal amount
     * 
     * R is the rate and
     * 
     * T is the time span
     */

    public static void main(String[] args) {

        double princAmount = 1200, time = 2, rate = 5.4, mult = 1;

        double interm = (1 + rate / 100);

        while (time > 0) {
            mult = mult * interm;
            time--;
        }
        System.out.println(princAmount * mult);
    }

}
