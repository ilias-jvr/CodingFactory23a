package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * λαμβάνει τρεις τιμές από τον χρήστη, τις a, b, c
 * όπου α είναι η υποτείνουσα και
 * b, c οι δύο πλευρές.
 *
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλ.
 * α^2 == b^2 + c^2
 *
 * έστω EPSILON = 0.000005
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON = 0.000005;
//        boolean isRight = false;

        System.out.println("Please provide (in doubles) the three sides of the triangle: \n (Remember that the first input double is the triangle's hypotenuse)");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a * a - ( b * b + c * c)) <= EPSILON) {
            System.out.println("is Right");
        } else {
            System.out.printf("is NOT Right");
        }
    }
}
