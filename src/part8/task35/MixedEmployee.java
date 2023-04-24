package part8.task35;

public class MixedEmployee extends PercentageEmployee implements SalaryCalculator {
    private double baseSalary;

    public MixedEmployee(String name, double percentage, double sales, double baseSalary) {

        super(name, percentage, sales);
        this.baseSalary = baseSalary;
        this.position = "Mixed Employee";
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (getPercentage() * getSales());
    }
}
