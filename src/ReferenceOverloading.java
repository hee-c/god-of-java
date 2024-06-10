package src;

public class ReferenceOverloading {
    public static void main(String[] args) {
        ReferenceOverloading referenceOverloading =  new ReferenceOverloading();
        referenceOverloading.println(3);
    }

    public ReferenceOverloading() {
    }

    void println(int data) {
        System.out.println(data);
    }

    public void test(int... data) {
        data[0]++;
    }
}
