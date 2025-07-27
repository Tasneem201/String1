public class Left2 {

    // Method to rotate the first 2 characters to the end
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    // Main method for testing
    public static void main(String[] args) {
        Left2 l = new Left2();

        System.out.println(l.left2("Hello"));  // lloHe
        System.out.println(l.left2("java"));   // vaja
        System.out.println(l.left2("Hi"));     // Hi
    }
}

