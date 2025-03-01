import java.util.Scanner;

public class ETA {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variables for speed and distance
        int courierSpeed;
        double destinationDistance;

        // Prompt for courier speed
        System.out.print("Enter the courier's speed in mph: ");
        courierSpeed = input.nextInt();

    
        System.out.print("Enter the distance to the destination in miles: ");
        destinationDistance = input.nextDouble();

    
        input.close();

        // Calculate estimated time
        int estimatedTimeOfArrivalHours = (int) (destinationDistance / courierSpeed);  // Whole number of hours
        double remainingFraction = (destinationDistance / courierSpeed) - estimatedTimeOfArrivalHours;
        int estimatedTimeOfArrivalMinutes = (int) (remainingFraction * 60); // Convert fraction to minutes

        // Output results
        System.out.println("\nDistance of package: " + destinationDistance + " miles");
        System.out.println("Courier Speed: " + courierSpeed + " mph");
        System.out.println("ETA: " + estimatedTimeOfArrivalHours + " hours and " + estimatedTimeOfArrivalMinutes + " minutes");
    }
}