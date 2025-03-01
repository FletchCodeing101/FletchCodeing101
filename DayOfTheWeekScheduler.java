import java.util.Scanner;
public class DayOfTheWeekScheduler{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number representing the day of the week (1 for Monday - 7 for Sunday): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday: Go to the gym");
                break;
            case 2:
                System.out.println("Tuesday: Attend a coding class");
                break;
            case 3:
                System.out.println("Wednesday: Work on a personal project");
                break;
            case 4:
                System.out.println("Thursday: Join a book club meeting");
                break;
            case 5:
                System.out.println("Friday: Go out with friends");
                break;
            case 6:
                System.out.println("Saturday: Relax and watch movies");
                break;
            case 7:
                System.out.println("Sunday: Family time");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                break;
        }
        
        scanner.close();
    }
}

