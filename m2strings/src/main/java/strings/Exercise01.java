package strings;

/**
 * Determine if Numbers Contain Only Digits
 */
public class Exercise01 {

    static String text = """
            37000000,
            20000000,
            11.000.000
            """;

    public static void main(String[] args) {

        boolean hasOnlyDigits = hasOnlyNumericCharacters(text);
        System.out.println(hasOnlyDigits);
    }

    public static boolean hasOnlyNumericCharacters(String text) {

        String[] lines = text.split(",");
        for (String line : lines) {
            String strippedLine = line.strip();
            if (!containsOnlyDigits(strippedLine)) {
                return false;
            }
        }

        return true;

    }

    public static boolean containsOnlyDigits(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

}
