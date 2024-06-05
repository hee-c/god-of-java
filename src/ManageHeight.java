package src;

public class ManageHeight {
    int[][] gradeHeight;
    public static void main(String[] args) {
        ManageHeight mh = new ManageHeight();
        mh.setDate();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Class No.:" + i);
//            mh.printHeight(i);
            mh.printAverage(i);
        }
    }

    public void setDate() {
        gradeHeight = new int[][]{
                {170, 180, 173, 175, 177},
                {160, 165, 167, 186},
                {158, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172}
        };
    }

    public void printHeight(int classNo) {
        for (int height: gradeHeight[classNo - 1]) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        int sum = 0;
        for (int height: gradeHeight[classNo - 1]) {
            sum += height;
        }
        double average = (double) sum / gradeHeight[classNo - 1].length;
        System.out.println(average);
    }
}
