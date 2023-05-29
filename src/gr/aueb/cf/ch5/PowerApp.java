package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το α^n.
 */

public class PowerApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int result;

        result = pow(a, b);

        System.out.println("Result: " + result);
    }

    /**
     * returns the power of an int.
     * @param a     the base.
     * @param n     the power to raise.
     * @return      the power of a^n.
     */
    public static int pow(int a, int n) {
        int result = 1;
        int i = 1;

        while (i <= n) {
            result = result * a;
            i++;
        }
        return result;

//        int power = 1;
//        for (int i = 1; i <= n; i++) {
//            power = power * a;
//        }
//        return power;
    }
}
