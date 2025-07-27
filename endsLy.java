public class EndsLy {

    // Method to check if a string ends with "ly"
    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    // Main method for testing
    public static void main(String[] args) {
        EndsLy e = new EndsLy();

        System.out.println(e.endsLy("oddly"));  // true
        System.out.println(e.endsLy("y"));      // false
        System.out.println(e.endsLy("oddy"));   // false
        System.out.println(e.endsLy("happily")); // true
    }
}

