package d.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

    public static void main(String[] args) {
        ManageHeight mh = new ManageHeight();
        mh.setData();

        for (int i = 1; i <= 5; i++) {
            mh.printHeight(i);
        }

        for (int i = 1; i <= 5; i++) {
            mh.printAverage(i);
        }
    }

    public void setData() {
        gradeHeights.add(new ArrayList<>(Arrays.asList(170, 180, 173, 175, 177)));
        gradeHeights.add(new ArrayList<>(Arrays.asList(160, 165, 167, 186)));
        gradeHeights.add(new ArrayList<>(Arrays.asList(158, 177, 187, 176)));
        gradeHeights.add(new ArrayList<>(Arrays.asList(173, 182, 181)));
        gradeHeights.add(new ArrayList<>(Arrays.asList(170, 180, 165, 177, 172)));
    }

    public void printHeight(int classNo) {
        System.out.println("Class: " + classNo);
        for (Integer s: gradeHeights.get(classNo - 1)) {
            System.out.println(s);
        }
    }

    public void printAverage(int classNo) {
        double average = 0;
        for (Integer s: gradeHeights.get(classNo - 1)) {
            average += s;
        }
        average /= gradeHeights.get(classNo - 1).size();
        System.out.println("Average: " + average);
    }
}
