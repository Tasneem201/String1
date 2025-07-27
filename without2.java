public class Without2 {

    public String without2(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    public static void main(String[] args) {
        Without2 w = new Without2();

        System.out.println(w.without2("HelloHe")); // → "lloHe"
        System.out.println(w.without2("HelloHi")); // → "HelloHi"
        System.out.println(w.without2("Hi"));      // → ""
        System.out.println(w.without2("H"));       // → "H"
        System.out.println(w.without2(""));        // → ""
    }
}

