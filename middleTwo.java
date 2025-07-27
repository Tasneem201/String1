public class MiddleTwo {

    // Method to return the middle two characters of an even-length string
    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        MiddleTwo m = new MiddleTwo();

        System.out.println(m.middleTwo("string"));    // ri
        System.out.println(m.middleTwo("code"));      // od
        System.out.println(m.middleTwo("Practice"));  // ct
    }
}

