package src;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();

        for (int i = 1; i <= 365; i+=10) {
            System.out.println(interestManager.calculateAmount(i, 1000000));
        }
    }

    public double getInterestRate(int day) {
        double interestRate;

        if (day <= 90) {
            interestRate = 0.005;
        } else if (day <= 180) {
            interestRate = 0.01;
        } else if (day <= 364) {
            interestRate = 0.02;
        } else {
            interestRate = 0.056;
        }

        return interestRate;
    }

    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);

        return amount + amount * interestRate;
    }
}
