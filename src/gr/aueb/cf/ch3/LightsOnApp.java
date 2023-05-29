package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα ενός αυτοκινήτου,
 * με βάση τρεις  (3) μετραβλητές.
 * Αν βρέχει ΚΑΙ ταυτόχρονα ισχύει ένα τουλάχιστον από τα επόμενα:
 * είναι σκοτάδι Ή τρέχουμε (speed > 100). Τις τιμές αυτές της λαμβάνουμε
 * από το χρήστη (stdin).
 *
 * @author liak0s (28/03/2023)
 */
public class LightsOnApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        //Εντολές
        System.out.println("Please insert if it is raining (true/false): ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false): ");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed: (int)");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRaining && (isDark || isRunning);

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Lights on: " + lightsOn);
    }
}
