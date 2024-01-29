package strings;

public class EmptyBlankDemo {
    public static void main(String[] args) {
        /**
         * Empty()
         * */
        System.out.println("isEmpty()");
        System.out.println("".isEmpty());   //True

        // Carriage return
        System.out.println("\r".isEmpty());           // False
        System.out.println("\u2002".isEmpty());       // False
        System.out.println(" ".isEmpty());            // False

        /**
         * Blank()
         * */
        System.out.println("isBlank()");

        /**
         * Evil String
         * */
        String evilString = "\u2002";
        System.out.println("Careful!");

        System.out.println(evilString.trim().isEmpty());  // False
        System.out.println(evilString.strip().isBlank()); // Redundant
        System.out.println(evilString.isBlank());         // True

    }
}
