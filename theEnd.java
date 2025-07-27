public class TheEnd {

    // Method to return first or last character based on the 'front' boolean
    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        TheEnd t = new TheEnd();

        System.out.println(t.theEnd("Hello", true));   // H
        System.out.println(t.theEnd("Hello", false));  // o
        System.out.println(t.theEnd("oh", true));      // o
    }
}

