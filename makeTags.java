public class MakeTags {

    // Method to wrap the word with HTML tags
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    // Main method for testing
    public static void main(String[] args) {
        MakeTags mt = new MakeTags();

        System.out.println(mt.makeTags("i", "Yay"));       // <i>Yay</i>
        System.out.println(mt.makeTags("i", "Hello"));     // <i>Hello</i>
        System.out.println(mt.makeTags("cite", "Yay"));    // <cite>Yay</cite>
    }
}

