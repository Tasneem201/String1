public class MiddleThree {

    // Method to return 3 characters from the middle of the string
    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    // Main method for testing
    public static void main(String[] args) {
        MiddleThree m = new MiddleThree();

        System.out.println(m.middleThree("Candy"));    // and
        System.out.println(m.middleThree("and"));      // and
        System.out.println(m.middleThree("solving"));  // lvi
    }
}

