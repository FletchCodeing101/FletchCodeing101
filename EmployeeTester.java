
// EmployeeTester.java
// Employee.java
// FulltimeEmployee.java
// PartTimeEmployee.java
public class EmployeeTester {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 5000.0);
        Employee partTime = new PartTimeEmployee("Bob", 20.0, 160);
        System.out.println(fullTime.getName() + "'s salary: " + fullTime.calculateSalary());
        System.out.println(partTime.getName() + "'s salary: " + partTime.calculateSalary());
    }
}
