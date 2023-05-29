package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει σε φθίνουσα σειρά
 * 10, 9 , 8.. ,1 αστεράκια
 * σε κάθε γραμμή
 */
public class Stars10Desc {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) { //for (int j = 10; j <= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
