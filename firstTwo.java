public class FirstTwo {

    // Method to return the first two characters of the string
    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    // Main method for testing
    public static void main(String[] args) {
        FirstTwo f = new FirstTwo();

        System.out.println(f.firstTwo("Hello"));    // He
        System.out.println(f.firstTwo("abcdefg"));  // ab
        System.out.println(f.firstTwo("ab"));       // ab
        System.out.println(f.firstTwo("X"));        // X
        System.out.println(f.firstTwo(""));         // (empty string)
    }
}

