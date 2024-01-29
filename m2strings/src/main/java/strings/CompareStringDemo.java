package strings;

public class CompareStringDemo {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2); // False - Two different objects
        System.out.println(s1.equals(s2)); // True - Same content

    }
}
