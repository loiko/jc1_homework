package part8.task35;

public class HourlyEmployee extends Employee implements SalaryCalculator {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {

        super(name, "Hourly Employee");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

