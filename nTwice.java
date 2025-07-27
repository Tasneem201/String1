public class NTwice {

    // Method to return a string made of the first and last n characters
    public String nTwice(String str, int n) {
        String start = str.substring(0, n);
        String end = str.substring(str.length() - n);
        return start + end;
    }

    // Main method for testing
    public static void main(String[] args) {
        NTwice nt = new NTwice();

        System.out.println(nt.nTwice("Hello", 2));      // Helo
        System.out.println(nt.nTwice("Chocolate", 3));  // Choate
        System.out.println(nt.nTwice("Chocolate", 1));  // Ce
    }
}

