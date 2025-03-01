import java.util.Scanner;
public class WhileLoopSumofPositiveNumbers{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; 
        int number;  
        while (sum >= 0) { // loop runs forever until told to stop
            System.out.print("Enter a positive number then Enter a negative number to stop the addition: ");
            number = scanner.nextInt(); 
            if (number < 0) {
                break; // If the number is negative stop the loop
                } 
                sum += number;
        }
        System.out.println("The sum of all positive numbers entered is: " + sum);
        scanner.close();
    }
}

