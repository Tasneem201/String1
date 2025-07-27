public class FirstHalf {

    // Method to return the first half of an even-length string
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    // Main method for testing
    public static void main(String[] args) {
        FirstHalf f = new FirstHalf();

        System.out.println(f.firstHalf("WooHoo"));      // Woo
        System.out.println(f.firstHalf("HelloThere"));  // Hello
        System.out.println(f.firstHalf("abcdef"));      // abc
    }
}

