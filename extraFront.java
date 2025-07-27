public class ExtraFront {

    // Method to return 3 copies of the first 2 characters
    public String extraFront(String str) {
        String front;
        if (str.length() < 2) {
            front = str;
        } else {
            front = str.substring(0, 2);
        }
        return front + front + front;
    }

    // Main method to test examples
    public static void main(String[] args) {
        ExtraFront ef = new ExtraFront();

        System.out.println(ef.extraFront("Hello"));  // → "HeHeHe"
        System.out.println(ef.extraFront("ab"));     // → "ababab"
        System.out.println(ef.extraFront("H"));      // → "HHH"
        System.out.println(ef.extraFront(""));       // → ""
    }
}

