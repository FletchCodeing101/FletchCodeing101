import java.util.Scanner;
public class CountingOccurrencesofaValueinanArray{
    public static void main(String[] args) {
	// Step 1: Initialize array
        int[] numbers = {3, 5, 7, 3, 8, 3, 2, 7, 3, 5};

        // Step 2: Ask user to enter number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int searchValue = scanner.nextInt();
        // Step 3: Count occurrences of entered number
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                count++;
            }
        }

        // Step 4: Display result
        System.out.println("The number " + searchValue + " appears " + count + " times in the array.");
        scanner.close();
    }
}
