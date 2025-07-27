public class MakeOutWord {

    // Method to insert the word into the middle of the out string
    public String makeOutWord(String out, String word) {
        String start = out.substring(0, 2);  // First two chars
        String end = out.substring(2);       // Last two chars
        return start + word + end;
    }

    // Main method for testing
    public static void main(String[] args) {
        MakeOutWord m = new MakeOutWord();

        System.out.println(m.makeOutWord("<<>>", "Yay"));      // <<Yay>>
        System.out.println(m.makeOutWord("<<>>", "WooHoo"));   // <<WooHoo>>
        System.out.println(m.makeOutWord("[[]]", "word"));     // [[word]]
    }
}

