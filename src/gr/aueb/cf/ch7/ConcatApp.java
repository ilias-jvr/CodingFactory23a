package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings.
 */
public class ConcatApp {

    public static void main(String[] args) {
        String title = "..soon to be Dr.";
        String firstname = "Ilias.";
        String lastname = "Tzavaras";
        String fullName;
        String titledFullName;

        fullName = firstname + lastname;
        titledFullName = title.concat(firstname).concat(lastname);

        System.out.println(fullName);
        System.out.println(titledFullName);

    }
}
