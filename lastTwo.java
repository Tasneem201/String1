public class LastTwo {

    // Method to swap the last two characters of a string
    public String lastTwo(String str) {
        int len = str.length();
        if (len < 2) {
            return str;
        }
        return str.substring(0, len - 2) + str.charAt(len - 1) + str.charAt(len - 2);
    }

    // Main method to test the function
    public static void main(String[] args) {
        LastTwo lt = new LastTwo();

        System.out.println(lt.lastTwo("coding")); // codign
        System.out.println(lt.lastTwo("cat"));    // cta
        System.out.println(lt.lastTwo("ab"));     // ba
        System.out.println(lt.lastTwo("a"));      // a
        System.out.println(lt.lastTwo(""));       // (empty string)
    }
}

