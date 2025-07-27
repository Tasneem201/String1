public class WithoutX {

    public String withoutX(String str) {
        if (str.length() == 0) return str;

        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x") && str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public static void main(String[] args) {
        WithoutX wx = new WithoutX();

        System.out.println(wx.withoutX("xHix"));   // → "Hi"
        System.out.println(wx.withoutX("xHi"));    // → "Hi"
        System.out.println(wx.withoutX("Hxix"));   // → "Hxi"
        System.out.println(wx.withoutX("xx"));     // → ""
        System.out.println(wx.withoutX("x"));      // → ""
        System.out.println(wx.withoutX(""));       // → ""
    }
}

