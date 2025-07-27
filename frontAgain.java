public class FrontAgain {

    // Method to check if first 2 characters also appear at the end
    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }

        String front = str.substring(0, 2);
        String end = str.substring(str.length() - 2);

        return front.equals(end);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        FrontAgain fa = new FrontAgain();

        System.out.println(fa.frontAgain("edited")); // → true
        System.out.println(fa.frontAgain("edit"));   // → false
        System.out.println(fa.frontAgain("ed"));     // → true
        System.out.println(fa.frontAgain("a"));      // → false
        System.out.println(fa.frontAgain("abcab"));  // → false
    }
}

