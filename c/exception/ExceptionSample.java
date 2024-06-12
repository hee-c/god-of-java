package c.exception;

public class ExceptionSample {
    public static void main(String[] args) throws Exception{
        ExceptionSample sample = new ExceptionSample();
        throw new Exception();
    }

    public void ar() {
        int[] a = new int[5];
        System.out.println(a[5]);
    }
}
