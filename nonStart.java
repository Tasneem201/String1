public class NonStart {

    // Method to return concatenation of two strings without their first chars
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    // Main method for testing
    public static void main(String[] args) {
        NonStart n = new NonStart();

        System.out.println(n.nonStart("Hello", "There"));   // ellohere
        System.out.println(n.nonStart("java", "code"));     // avaode
        System.out.println(n.nonStart("shotl", "java"));    // hotlava
    }
}

