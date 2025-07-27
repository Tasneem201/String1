public class WithoutEnd {

    // Method to return the string without the first and last character
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        WithoutEnd w = new WithoutEnd();

        System.out.println(w.withoutEnd("Hello"));   // ell
        System.out.println(w.withoutEnd("java"));    // av
        System.out.println(w.withoutEnd("coding"));  // odin
    }
}

