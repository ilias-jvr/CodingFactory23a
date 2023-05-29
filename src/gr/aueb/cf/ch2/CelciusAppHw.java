package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει θερμοκρασίες Fahreneit σε Celcius
 *
 * @author a8ana
 */
public class CelciusAppHw {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int celcius = 0;
        int fahrenheit = 0;

        System.out.println("Please provide temp in Fahrenheit: ");
        fahrenheit = in.nextInt();

        celcius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d\u00B0C = %d\u00B0F", celcius, fahrenheit);
    }
}
