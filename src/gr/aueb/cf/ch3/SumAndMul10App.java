package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άρθροισμα και
 * το γινόμενο των 10 πρώτων
 * ακεραίων.
 *
 * @author liakos 28/03/2023
 */
public class SumAndMul10App {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum = sum + i; // Παράδειγμα γραφής sum += i;
            mul *= i; // Παράδειγμα γραφής mul = mul + i;
            i++;
            //System.out.println("Sum: " + sum); θα εκτυπώσει όλα τα sum μέχρι το τελευταίο, επειδή είναι εντός while
        }
        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
