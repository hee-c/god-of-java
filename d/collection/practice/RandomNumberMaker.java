package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomNumberMaker.getSixNumber());
        }
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> sixNumbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sixNumbers.add(random.nextInt(100));
        }
        return sixNumbers;
    }
}
