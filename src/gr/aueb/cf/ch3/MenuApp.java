package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού επιλογών
 * μέχρι ο χρήστης να επιλέξει έξοδο.
 *
 * @author liakos (28/03/2023)
 */
public class MenuApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή πρoϊόντος");
            System.out.println("2. Διαγραφή πρoϊόντος");
            System.out.println("3. Έξοδος");
            choice = in.nextInt();

        } while (choice != 3);
    }
}
