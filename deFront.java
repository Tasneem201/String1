public class DeFront {

    public String deFront(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result += str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result += str.charAt(1);
        }

        if (str.length() > 2) {
            result += str.substring(2);
        }

        return result;
    }

    public static void main(String[] args) {
        DeFront d = new DeFront();

        System.out.println(d.deFront("Hello")); // → "llo"
        System.out.println(d.deFront("java"));  // → "va"
        System.out.println(d.deFront("away"));  // → "aay"
        System.out.println(d.deFront("ab"));    // → "ab"
        System.out.println(d.deFront("a"));     // → "a"
        System.out.println(d.deFront("b"));     // → ""
        System.out.println(d.deFront(""));      // → ""
    }
}

