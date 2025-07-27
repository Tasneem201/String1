public class TwoChar {

    // Method to return a 2-character substring starting at index, or first 2 if index is invalid
    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    // Main method for testing
    public static void main(String[] args) {
        TwoChar t = new TwoChar();

        System.out.println(t.twoChar("java", 0));  // ja
        System.out.println(t.twoChar("java", 2));  // va
        System.out.println(t.twoChar("java", 3));  // ja
        System.out.println(t.twoChar("hi", 1));    // hi
    }
}

