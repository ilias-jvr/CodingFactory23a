package gr.aueb.cf.ch4;

import java.util.Scanner;

public class FrogAppBest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positionFirst;
        int positionEnd;
        int distanceStep;
        int jumps = 0;

        System.out.println("Please provide the start position of the frog (int), the end position of the frog (int), and the jump length (int)!");
        positionFirst = in.nextInt();
        positionEnd = in.nextInt();
        distanceStep = in.nextInt();

        jumps = (int) Math.ceil((positionEnd - positionFirst) / (double) distanceStep);

        System.out.printf("He made it with %d jumps!", jumps);
    }
}
