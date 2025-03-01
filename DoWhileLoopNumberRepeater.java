import java.util.Scanner;
public class DoWhileLoopNumberRepeater {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("How many times do you want to print this number? ");
        int times = scanner.nextInt();
        int i = 0; // Counter to keep track of how many times we've printed
        do {
            System.out.println(number);
            i++;
        } while (i < times);
        
       
        scanner.close();
    }
}