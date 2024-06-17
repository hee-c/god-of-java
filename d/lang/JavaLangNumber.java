package d.lang;

public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber number = new JavaLangNumber();
        number.numberTypeCheck();
    }

    public void numberTypeCheck() {
        String s1 = "3";
        String s2 = "5";
        byte b1 = Byte.parseByte(s1);
        byte b2 = Byte.parseByte(s2);
        Byte b3 = Byte.valueOf(s1);
        System.out.println(b1 + b2);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Integer refi1 = Integer.valueOf(s1);
        Integer refi2 = Integer.valueOf(s2);
        System.out.println(refi1 + refi2 + "7");
    }
}
