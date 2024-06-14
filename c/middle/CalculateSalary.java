package c.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        int type = employee.getType();
        long salary = employee.getSalary();
        double increaseRate = switch (type) {
            case 1 -> -0.95;
            case 2 -> 0.1;
            case 3 -> 0.2;
            case 4 -> 0.3;
            default -> 1;
        };

        return (long) (salary * increaseRate) + salary;
    }

    public void calculateSalaries() {
        Employee[] employees = new Employee[]{
                new Employee("T1", 1, 1000000000),
                new Employee("T2", 2, 100000000),
                new Employee("T3", 3, 70000000),
                new Employee("T4", 4, 80000000),
                new Employee("T5", 5, 60000000),
        };

        for (Employee employee : employees) {
            long salary = getSalaryIncrease(employee);
            System.out.println(employee.getName() + "=" + salary);
        }
    }
}
