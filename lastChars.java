public class LastChars {

    // Method to return a new string from first char of a and last char of b
    public String lastChars(String a, String b) {
        char first = a.length() > 0 ? a.charAt(0) : '@';
        char last = b.length() > 0 ? b.charAt(b.length() - 1) : '@';
        return "" + first + last;
    }

    // Main method for testing
    public static void main(String[] args) {
        LastChars lc = new LastChars();

        System.out.println(lc.lastChars("last", "chars")); // ls
        System.out.println(lc.lastChars("yo", "java"));     // ya
        System.out.println(lc.lastChars("hi", ""));         // h@
        System.out.println(lc.lastChars("", "hello"));      // @o
        System.out.println(lc.lastChars("", ""));           // @@
    }
}

