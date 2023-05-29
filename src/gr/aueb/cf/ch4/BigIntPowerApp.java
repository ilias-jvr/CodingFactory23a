package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το a^n me BigInteger.
 */
public class BigIntPowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a;
        BigInteger n;
        BigInteger result = new BigInteger("1"); //BigIneger.ONE;

        System.out.println("Please insert two ints base and power:");
        a = BigInteger.valueOf(in.nextInt());
        n = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(a);
        }

//        for (int i = 1; i <= n; i++){
//            result = result.multiply(BigInteger.valueOf(a));
//        }
//        επίσης αποδεκτό

        System.out.printf("%d^%d = %,d", a, n, result);
    }
}
