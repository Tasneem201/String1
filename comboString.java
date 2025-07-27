public class ComboString {

    // Method to return short+long+short
    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        ComboString c = new ComboString();

        System.out.println(c.comboString("Hello", "hi"));   // hiHellohi
        System.out.println(c.comboString("hi", "Hello"));   // hiHellohi
        System.out.println(c.comboString("aaa", "b"));      // baaab
    }
}

