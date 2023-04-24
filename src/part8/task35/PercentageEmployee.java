package part8.task35;

public class PercentageEmployee extends Employee implements SalaryCalculator {
    private double percentage;
    private double sales;

    public PercentageEmployee(String name, double percentage, double sales) {

        super(name, "Percentage Employee");
        this.percentage = percentage;
        this.sales = sales;
    }

    public double getPercentage() {
        return percentage;
    }

    public double getSales() {
        return sales;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        return percentage * sales;
    }
}
