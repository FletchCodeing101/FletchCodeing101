import java.util.Scanner;

public class CountdownTimer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter countdown time in seconds: ");
        int time = scanner.nextInt();

        for (int i = time; i >= 0; i--) {
            System.out.println(i + " seconds remaining...");
            Thread.sleep(1000); // Waits for 1 second
        }

        System.out.println("Time's up!");
        scanner.close();
    }
}
