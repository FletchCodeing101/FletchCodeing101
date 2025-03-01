// Write your name here
// Fletcher Baccus
// Create a class called Student in the Student.java file with the following attributes: 
// name (String), rollNumber (int), and grades (an array of integers).
// Include a constructor to initialize the name and roll number. Implement methods to:
// Add a grade to the grades array.
// Calculate and return the average grade.
// Display all the Student's information (name, roll number, and grades).
import java.util.ArrayList;

class Student {
    // Write your code here...
    String name;
    int rollNumber;
    ArrayList<Integer> grades;

    // Constructor for name and roll number
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade to the array
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Method to calculate and return the average grade
    public double calculateAverageGrade() {
        if (grades.size() == 0) {
            return 0;  
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / (double) grades.size();
    }

    // Method to display the student's information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}
