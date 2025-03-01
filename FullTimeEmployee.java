//FullTimeEmployee:
//A private double monthlySalary instance variable.
//A constructor that takes name and monthlySalary as arguments.
//Override calculateSalary() to return the monthly salary.
class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(String name, double monthlySalary) { //Constructor
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return this.monthlySalary;
    }
}