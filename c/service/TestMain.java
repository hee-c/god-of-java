package c.service;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        OverTimeValues a = OverTimeValues.T;

        OverTimeValues[] l = OverTimeValues.values();

        for (OverTimeValues v : l) {
            System.out.println(v);
        }
    }
}
