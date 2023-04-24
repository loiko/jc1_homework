package part8.task35;

public class Main {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Michael Corleone", 30.0, 80);
        double hourlySalary = hourlyEmployee.calculateSalary();
        System.out.println(hourlyEmployee.getName() + " is an " + hourlyEmployee.getPosition() + " and earns $" + hourlySalary + " per week");

        PercentageEmployee percentageEmployee = new PercentageEmployee("Sonny Corleone", 1, 5000.0);
        double percentageSalary = percentageEmployee.calculateSalary();
        System.out.println(percentageEmployee.getName() + " is a " + percentageEmployee.getPosition() + " and earns $" + percentageSalary + " per week");

        MixedEmployee mixedEmployee = new MixedEmployee("Vito Corleone", 10, 1000.0, 800.0);
        double mixedSalary = mixedEmployee.calculateSalary();
        System.out.println(mixedEmployee.getName() + " is a " + mixedEmployee.getPosition() + " and earns $" + mixedSalary + " per week");
    }
}
