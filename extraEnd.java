public class ExtraEnd {

    // Method to return 3 copies of the last 2 characters
    public String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;
    }

    // Main method for testing
    public static void main(String[] args) {
        ExtraEnd e = new ExtraEnd();

        System.out.println(e.extraEnd("Hello"));  // lololo
        System.out.println(e.extraEnd("ab"));     // ababab
        System.out.println(e.extraEnd("Hi"));     // HiHiHi
    }
}

