package e.thread.sync;

public class CommonCalculate {
    private int amount;

    public CommonCalculate() {
        amount = 0;
    }

    public void plus(int v) {
        amount += v;
    }

    public void minus(int v) {
        amount -= v;
    }

    public int getAmount() {
        return amount;
    }
}
