package gr.aueb.cf.ch7;

public class EqualsApp{

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens.");

        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

//        if (s1.equalsIgnoreCase(s3)) {
//            System.out.println("Equal");
//        } συγκρίνει αγνοώντας το upper/low case

    }
}
