//PartTimeEmployee:
//private double hourlyRate and private int hoursWorked instance variables.
//A constructor that takes name, hourlyRate, and hoursWorked as arguments.
//Override calculateSalary() to return the product of hourlyRate and hoursWorked.
public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return this.hourlyRate * this.hoursWorked;
    }
}