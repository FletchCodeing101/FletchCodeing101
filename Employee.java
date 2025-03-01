//Employee:
//A protected String name instance variable.Done
//A protected constructor that initializes the name.Done
//A method public double calculateSalary() that returns 0.0. Done
public class Employee{
    protected String name; // Protected instance variable
    protected Employee(String name) { // protected constructor that initializes the name
        this.name = name;
    }

    public double calculateSalary() {
        return 0.0;
    }
    public String getName() {
        return this.name;
    }
}