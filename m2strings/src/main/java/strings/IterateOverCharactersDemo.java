package strings;

public class IterateOverCharactersDemo {

    public static void main(String[] args) {

        String str = "Some String";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Do things with the char
        }
        for(char c: str.toCharArray()){
            System.out.println(c);
        }

        System.out.println("Specific char to upperCase: ");
        System.out.println(charToUpperCase(str,'i'));
        System.out.println(charToUpperCase(str,'e'));

    }

    private static String charToUpperCase(String str, char charToUpper){

        var sb = new StringBuilder();
        for (char c: str.toCharArray()){
            char charToAppend = c == charToUpper ? Character.toUpperCase(c) : c;
            sb.append(charToAppend);
        }

        return sb.toString();

    }
}
