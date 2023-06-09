package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch instead of if-then-else if.
 * Gets a user's choice based on a menu
 * and returns a feedback/confirmation
 */
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. One-Player Game");
            System.out.println("2. Two-Player Game");
            System.out.println("3. Team Game");
            System.out.println("4. Quit");
            System.out.println("Please provide a choice: ");

            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Start One-Player Game");
                    break;
                case 2:
                    System.out.println("Start Two-Player Game");
                    break;
                case 3:
                    System.out.println("Start Team Game");
                    break;
                case 4:
                    System.out.println("Quit Game");
                    break;
                default:
                    System.out.println("Error in choice!");
                    break;
            }
        } while (choice != 4);

        System.out.println("Goodbye!");
    }
}
