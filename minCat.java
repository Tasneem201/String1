public class MinCat {

    // Method to concatenate equal-length versions of the strings
    public String minCat(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        String aSub = a.substring(a.length() - minLen);
        String bSub = b.substring(b.length() - minLen);
        return aSub + bSub;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        MinCat mc = new MinCat();

        System.out.println(mc.minCat("Hello", "Hi"));     // → "loHi"
        System.out.println(mc.minCat("Hello", "java"));   // → "ellojava"
        System.out.println(mc.minCat("java", "Hello"));   // → "javaello"
        System.out.println(mc.minCat("abc", "x"));        // → "cx"
        System.out.println(mc.minCat("", "Hello"));       // → ""
    }
}

