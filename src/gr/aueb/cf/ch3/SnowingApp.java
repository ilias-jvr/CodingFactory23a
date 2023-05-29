package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει ή όχι, με βάση
 * όχι μόνο τη θερμοκρασία, αλλά και αν βρέχει.
 * Αν βρέχει και η θερμοκρασία είναι < 0, τότε χιονίζει,
 * αλλιώς όχι.
 *
 * @author liak0s (28/03/2023)
 */
public class SnowingApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        //Εντολές
        System.out.println("Please insert if it is raining (true/false): ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature: ");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Is snowing: " + isSnowing);
    }
}
