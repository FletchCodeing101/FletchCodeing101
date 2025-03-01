
public class ExploringVariables {
 
    public static void main(String[] args) {
     
    // Exercise 1: Declaring and Initializing Variables
     
    // 1.1 Declare an integer variable named 'age' and initialize it to your age.
     
    int age = 18; //int is used because my age is a whole number.
     
    // 1.2 Declare a double variable named 'height' and initialize it to your height in meters.
     
    double height = 1.93; // double is used because my height in meters would have a decimal so double is used.
     
    // 1.3 Declare a boolean variable named 'isStudent' and initialize it to true if you are a student, false otherwise.
     
    boolean isStudent = true; //boolean is either true or false so it's used to clarify whether or not Im a student.
     
    // (true is chosen because I am indeed a student).
     
    // 1.4 Declare a String variable named 'name' and initialize it to your name.
     
    String name = "Fletcher"; //String is used with words and my name is a word so String will be used to declare my name
     
    // Exercise 2: Printing Variable Values
     
    // 2.1 Print the values of all the variables you declared in Exercise 1
     
    // using System.out.println(). Include descriptive labels in the output.
     
    System.out.println("My Name Is: " + name);//should print my name is: Fletcher
     
    System.out.println("I am " + age + " Years Old");//I am 18 Years Old
     
    System.out.println("My Height is 6ft 4inches but " + height + " in meters");
     
    System.out.println("Are you a Student: " + isStudent);//IsStudent will print out True
     
    // Exercise 3: Modifying Variable Values
     
    // 3.1 Change the value of the 'age' variable to your age next year.
     
    age = age + 1; // Increment age by 1 for next year == i++ this will add a year to my current age.
     
    // 3.2 Change the value of the 'isStudent' variable to its opposite.
     
    isStudent = !isStudent; // "!" is used as a differnce operator basically stating that instead of true it should print out false.
     
    // 3.3 Print the updated values of 'age' and 'isStudent'.
     
    System.out.println("\nUpdated Age: " + age);//Prints updated age which is 19
     
    System.out.println("Updated Is Student: " + isStudent);//Prints false for is a student
     
    // Exercise 4: Exploring Different Data Types
     
    // 4.1 Declare a 'char' variable named 'initial' and initialize it to the first letter of your last name.
     
    char initial = 'B'; // My name is Fletcher Baccus meaning my last initial is 'B'
     
    // 4.2 Declare a 'float' variable named 'weight' and initialize it to your weight in kilograms (use a float literal, e.g., 70.5f).
     
    float weight = 90.7f; // My weight in kilograms is 90.7 and the f at the end is required due to this line of code being a float value.
     
    // 4.3 Print the values of 'initial' and 'weight'.
     
    System.out.println("\nInitial: " + initial);//Prints my initial
     
    System.out.println("Weight: " + weight + " kg");//Prints weight in KGs
     
    // Exercise 5: Type Conversion (Casting)
     
    // 5.1 Declare an integer variable 'totalHeight' and assign it the value of 'height' converted to an integer (using casting). Note what happens to the decimal portion.
     
    int totalHeight = (int) height; // the height will be converted to a whole number due to the line of code being a integer
     
    // 5.2 Print the value of 'totalHeight'.
     
    System.out.println("\nTotal Height (as an integer): " + totalHeight);//height will be a whole number
     
    System.out.println("\nLab Completed");//Added to the bottom as a line of code ending the program with outputting that the lab has been completed.
     
    }
}
     
    