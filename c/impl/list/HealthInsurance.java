package c.impl.list;

public enum HealthInsurance {
    LEVEL_ONE(1000, 0.01),
    LEVEL_TWO(2000, 0.02),
    LEVEL_THREE(3000, 0.032),
    LEVEL_FOUR(4000, 0.045),
    LEVEL_FIVE(5000, 0.056),
    LEVEL_SIX(6000, 0.071);


    final int maxSalary;
    final double ratio;

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public static HealthInsurance getHealthInsurance(int maxSalary) {
        HealthInsurance result = HealthInsurance.LEVEL_SIX;
        for (HealthInsurance healthInsurance : HealthInsurance.values()) {
            if (healthInsurance.getMaxSalary() >= maxSalary) {
                result = healthInsurance;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] salaryArray = new int[]{1500, 5500, 8000};
        HealthInsurance[] insurances = new HealthInsurance[3];

        for (int i = 0; i < insurances.length; i++) {
            insurances[i] = getHealthInsurance(salaryArray[i]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(salaryArray[i] + "=" + insurances[i]+","+insurances[i].getRatio());
        }
    }
}
