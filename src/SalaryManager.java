package src;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        double monthlySalary = salaryManager.getMonthlySalary(20000000);
        System.out.println(monthlySalary);
    }

    public double getMonthlySalary(int yearSalary) {
        double monthlySalary = yearSalary / (double) 12;
        double tax = calculateTax(monthlySalary);
        double pension = calculateNationalPension(monthlySalary);
        double healthInsurance = calculateHealthInsurance(monthlySalary);
        monthlySalary -= tax + pension + healthInsurance;
        return monthlySalary;
    }

    public double calculateTax(double monthlySalary) {
        double result = monthlySalary * 0.125;
        System.out.println(result);
        return result;
    }

    public double calculateNationalPension(double monthlySalary) {
        double result = monthlySalary * 0.081;
        System.out.println(result);
        return result;
    }

    public double calculateHealthInsurance(double monthlySalary) {
        double result = monthlySalary * 0.135;
        System.out.println(result);
        return result;
    }
}
