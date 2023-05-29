package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει δύο δεξαμενές.
 * Αν η μία δεξαμενή έχει λιγότερα από
 * 1/4 καύσιμα τότε ανάβει πορτοκαλί
 * σήμα, ενώ αν και οι δύο δεξαμενές
 * έχουν < 1/4 τότε ανάβει κόκκινο σήμα.
 * Ο πιλότος (χρήστης) δίνει true ή
 * false ανάλογα αν tank < 1/4 ή όχι, αντίστοιχα.
 *
 * @author liakos (28/03/2023)
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        boolean istank1LTQuarter = false; //LT <-- LessThan
        boolean istank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        //Εντολές
        System.out.println("Please insert if tank 1, tank 2 are less than 1/4 (true/false) ");
        istank1LTQuarter = in.nextBoolean();
        istank2LTQuarter = in.nextBoolean();

        orangeOn = istank1LTQuarter || istank2LTQuarter;
        redOn = istank1LTQuarter && istank2LTQuarter;

        //Εκτύπωση
        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);
    }
}
