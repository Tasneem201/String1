public class Right2 {

    // Method to rotate the last 2 characters to the front
    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    // Main method for testing
    public static void main(String[] args) {
        Right2 r = new Right2();

        System.out.println(r.right2("Hello"));  // loHel
        System.out.println(r.right2("java"));   // vaja
        System.out.println(r.right2("Hi"));     // Hi
    }
}

