public class StartWord {

    public String startWord(String str, String word) {
        int len = word.length();

        if (str.length() >= len && str.substring(1, len).equals(word.substring(1))) {
            return str.substring(0, len);
        }

        return "";
    }

    public static void main(String[] args) {
        StartWord sw = new StartWord();

        System.out.println(sw.startWord("hippo", "hi"));   // → "hi"
        System.out.println(sw.startWord("hippo", "xip"));  // → "hip"
        System.out.println(sw.startWord("hippo", "i"));    // → "h"
        System.out.println(sw.startWord("hippo", "hip"));  // → "hip"
        System.out.println(sw.startWord("hello", "yellow")); // → ""
    }
}

