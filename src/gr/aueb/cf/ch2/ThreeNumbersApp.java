package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ζητάει από τον χρήστη τρεις ακεραίους,
 * τους μειώνει κατά μία (1) μονάδα, και τους
 * εμφανίζει με την ίδια σειρά που δόθηκαν
 * αφήνοντας ένα κενό ανάμεσά τους.
 *
 * @author liak0s (27/03/2023)
 */
public class ThreeNumbersApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        //Εντολές
        //num1 = num1 - 1; παράδειγμα γραφής
        //num1 -= 1; παράδειγμα γραφής4
        num1--;
        num2--;
        num3--;

        //Εκτύπωση αποτελεσμάτων
        //παράδειγμα γραφής         System.out.printf("%d, %d, %d", num1-1, num2-1, num3-1);
        System.out.printf("%d, %d, %d", num1, num2, num3);
    }
}
