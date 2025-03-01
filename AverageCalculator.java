
import java.util.Scanner;
public class AverageCalculator {
public static void main(String[] args) {
//initialize starting points of sum and count
Scanner scanner = new Scanner(System.in);
int number;
int sum = 0;
int count = 0;
//Output all positive numbers as well as the input of -1 ending this program
System.out.println("Enter Positive Numbers (Enter -1 to Stop):");
//Enter while True so the program continues as long as its true
while (true) {
number = scanner.nextInt();
//Enter an If Statement claiming that if number is equal to -1 that the program would end
if (number == -1) {
break;
} else if (number > 0) {
sum += number;
count++;
} else{
System.out.println("Please Enter a Positive Number or a -1 to Finish the Program");
}
}
if (count > 0) {
//Calculate average
double average = sum / count;
//Outprint Sum,Count,Averge and else statement
System.out.println("Total sum:" +sum);
System.out.println("Total Count of Numbers:" +count);
System.out.println("Total Average is:" +average);
} else{
System.out.println("Error Something Must Not Meet Requirements");
}
scanner.close();
}
}
