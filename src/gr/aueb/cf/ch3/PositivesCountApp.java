package gr.aueb.cf.ch3;

import java.security.PolicySpi;
import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών αριθμών
 * που δίνει ο χρήστης (stdin)
 *
 * @author liakos (28/03/2023)
 */
public class PositivesCountApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please give a num (int):");
        num = in.nextInt();

        while (num >= 0) {
            positiveCount++;
            System.out.println("Please give a num:");
            num = in.nextInt();
        }
        System.out.println("Positive-count: " + positiveCount);
    }
}
