package c.service;

public enum OverTimeValues {
    T(1);

    final int value;
    OverTimeValues(int a) {
        this.value = a;
    }

    public int getValue() {
        return value;
    }
}
