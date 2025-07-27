public class SeeColor {

    // Method to return "red" or "blue" if the string starts with them
    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        SeeColor sc = new SeeColor();

        System.out.println(sc.seeColor("redxx"));       // → "red"
        System.out.println(sc.seeColor("xxred"));       // → ""
        System.out.println(sc.seeColor("blueTimes"));   // → "blue"
        System.out.println(sc.seeColor("green"));       // → ""
        System.out.println(sc.seeColor("blue"));        // → "blue"
    }
}

