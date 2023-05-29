package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει
 * ένα ποτάμι.
 * o Frog βρίσκεται στη θέση Χ και θέλει να φτάσει
 * στη θέση  Y (ή σε θέση > Υ).
 *  ο Frog jumps a fixed distance, D
 *
 *  Βρίσκει το ελάχιστο αριθμό jumps, που ο small frog πρέπει να κάνει
 *  ώστε να φτάσει στο στόχο του. (ή να τον ξεπεράσει)
 *
 *  Για παράδειγμα
 *  Χ = 10
 *  Υ = 85
 *  D = 30
 *
 *  τότε ο small frog θα χρειαστεί τρία jumps, γιατί:
 *  Starts at 10, και μετά το πρώτο Jump πάει στη θέση που είναι το πρώτο jump10 + 30 = 40
 *  Στο 2ο jump, 40 + 30 = 70
 *  και στο 3ο jump,πάει 70 + 30 = 100
 */
public class FrogApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positionFirst;
        int positionEnd;
        int distanceStep;
        int iterations = 0;

        System.out.println("Please provide the start position of the frog (int), the end position of the frog (int), and the jump length (int)!");
        positionFirst = in.nextInt();
        positionEnd = in.nextInt();
        distanceStep = in.nextInt();

        for (int i = positionFirst; i < positionEnd; i = i + distanceStep) {
            iterations++;
            System.out.print(" Jump: " + i);
        }

        System.out.printf("\n He made it with %d jumps!!", iterations);
    }
}
