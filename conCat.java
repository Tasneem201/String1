public class ConCat {

    // Method to concatenate strings with logic to avoid double-char duplication
    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 &&
            a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);  // Skip first char of b
        }
        return a + b;
    }

    // Main method to test the function
    public static void main(String[] args) {
        ConCat cc = new ConCat();

        System.out.println(cc.conCat("abc", "cat"));  // abcat
        System.out.println(cc.conCat("dog", "cat"));  // dogcat
        System.out.println(cc.conCat("abc", ""));     // abc
        System.out.println(cc.conCat("", "cat"));     // cat
        System.out.println(cc.conCat("a", "a"));      // a
    }
}

