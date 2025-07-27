public class WithouEnd2 {

    // Method to return the string without the first and last characters
    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        WithouEnd2 w = new WithouEnd2();

        System.out.println(w.withouEnd2("Hello"));  // ell
        System.out.println(w.withouEnd2("abc"));    // b
        System.out.println(w.withouEnd2("ab"));     // (empty string)
        System.out.println(w.withouEnd2("a"));      // (empty string)
        System.out.println(w.withouEnd2(""));       // (empty string)
    }
}

