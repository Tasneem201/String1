public class AtFirst {

    // Method to return a 2-character string, padding with '@' if needed
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        AtFirst a = new AtFirst();

        System.out.println(a.atFirst("hello")); // he
        System.out.println(a.atFirst("hi"));    // hi
        System.out.println(a.atFirst("h"));     // h@
        System.out.println(a.atFirst(""));      // @@
    }
}

