package c.string;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convertUTF16();
    }

    public void convert() {
        try {
            String korean = "한글";

            byte[] arr = korean.getBytes();
            for (byte b : arr) {
                System.out.print(b + " ");
            }
            System.out.println();
            String arr2 = new String(arr);
            System.out.println(arr2);
        } catch (Exception e) {}
    }

    public void printByteArray(byte[] arr) {
        for (byte b : arr) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public void convertUTF16() {
        try {
            String korean = "한글";
            byte[] arr = korean.getBytes("UTF-16");
            printByteArray(arr);
            String kor2 = new String(arr, "UTF-16");
            System.out.println(kor2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
