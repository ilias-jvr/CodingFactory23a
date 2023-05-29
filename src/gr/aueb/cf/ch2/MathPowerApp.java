package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Βρίσει το τετράγωνο και τον κύβο
 * ενός ακεραίου που δίνει ο χρήστης
 *
 * @author liak0s (27/03/2023)
 */
public class MathPowerApp {

    public static void main(String[] args) {

        //Δήλωση κα αρχικποιήση
        Scanner in = new Scanner(System.in);
        int inputNum =0;

        //Εντολές
        System.out.println("Please insert a num (int)");
        inputNum = in.nextInt();

        //Εκτύπωση αποτελεσμάτων (περιέχει και πράξεις)
        System.out.printf("num: %d, square: %d, cube: %d",
                inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));
                //το (int) είναι typecaste γιατί το Math.pow επιστρέφει (double)

    }
}
