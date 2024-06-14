package c.string;

public class StringNull {
    public static void main(String[] args) {
        StringNull s = new StringNull();
        s.nullCheck(null);
    }

    public boolean nullCheck(String text) {
        int textLength = 3;
        System.out.println(3);
        if (text == null) return true;
        else return false;
    }
}
