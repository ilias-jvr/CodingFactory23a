package gr.aueb.cf.ch2;

/**
 * Ρίχνει δύο ζάρια
 *
 * @author liak0s (27/03/2023)
 */
public class RandomDiceApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποιήση
        int die1 = 0;
        int die2 = 0;

        //Εντολές
        die1 = (int) (Math.random() * 6) + 1; //το (int) <-- typecaste εφαρμόζεται μόνο στην παρένθεση
        die2 = (int) (Math.random() * 6) + 1;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Die1: %d, Die2: %d", die1, die2);
    }
}
