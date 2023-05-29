package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δείνει τρεις ακεραίους,
 * και βρίσκουμε τον μεγαλύτερο.
 *
 * @author liak0s (27/03/2023)
 */
public class MaxOfThreeInts {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //Εντολές
        System.out.println("Please insert three ints");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Max between %d, %d, %d is %d",
                num1, num2, num3, Math.max(num1, Math.max(num2, num3)));
    }
}
