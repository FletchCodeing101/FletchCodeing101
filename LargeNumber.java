
// Write your name here
// Fletcher Baccus
//Write a Java program in LargerNumber.java that takes two integer inputs from the user and prints the larger of the two numbers. 
//Use a conditional statement (if-else).
import java.util.Scanner;
public class LargeNumber {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Write your code here...
        // Prompt the user to enter two integers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Intitial the varible in order to store the larger number
        int largerNumber;

        // if-else statement used to determine the larger number
        if (num1 > num2) {
            largerNumber = num1;
        } else {
            largerNumber = num2;
        }

        System.out.println("The larger number is: " + largerNumber);

        input.close(); // Close the scanner to release resources (good practice)
    }
}
