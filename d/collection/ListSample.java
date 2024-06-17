package d.collection;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList1();
        sample.checkArrayList6();
    }

    public void checkArrayList1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("SAMPLE");
        list1.add("SAMPLE");
        System.out.println(list1.size());
    }

    public void checkArrayList6() {
        ArrayList<String> list6 = new ArrayList<>();
        list6.add("SAMPLE");
        list6.add("SAMPLE");
        list6.add("SAMPLE");
        list6.add("SAMPLE");
        String[] strList = list6.toArray(new String[10]);
        for (String s: strList) {
            System.out.println(s);
        }
    }
}
