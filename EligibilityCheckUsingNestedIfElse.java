import java.util.Scanner;
public class EligibilityCheckUsingNestedIfElse{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        // User input citizenship status
        System.out.print("Are you a citizen of the country? (yes/no): ");
        String citizenshipStatus = scanner.nextLine();
        // Check eligibility
        if (age >= 18 && citizenshipStatus.equals("yes")) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        System.out.println("Eligibility Status");
        scanner.close();
	}
}

