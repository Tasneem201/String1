public class WithoutX2 {

    public String withoutX2(String str) {
        if (str.length() >= 2) {
            String result = "";

            if (str.charAt(0) != 'x') {
                result += str.charAt(0);
            }

            if (str.charAt(1) != 'x') {
                result += str.charAt(1);
            }

            result += str.substring(2);
            return result;

        } else if (str.length() == 1) {
            return str.charAt(0) == 'x' ? "" : str;
        }

        return str; // empty string
    }

    public static void main(String[] args) {
        WithoutX2 w = new WithoutX2();

        System.out.println(w.withoutX2("xHi"));  // → "Hi"
        System.out.println(w.withoutX2("Hxi"));  // → "Hi"
        System.out.println(w.withoutX2("Hi"));   // → "Hi"
        System.out.println(w.withoutX2("xxHi")); // → "Hi"
        System.out.println(w.withoutX2("x"));    // → ""
        System.out.println(w.withoutX2(""));     // → ""
    }
}

