//Objective: Use a switch statement to create a system that calculates the total price after
//applying a discount based on the user’s membership level and the day of the week.
//Instructions:
//Prompt the user to enter their membership level (1 for "Bronze", 2 for "Silver", 3 for "Gold", 4 for "Platinum").
//Prompt the user to enter the day of the week as a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday).
//Based on the membership level, apply the following discounts:
//Bronze: 5% discount on Tuesday and Thursday only.
//Silver: 10% discount on Wednesday and Saturday only.
//Gold: 15% discount on any day except Sunday.
//Platinum: 20% discount on all days.
//If the user’s input is invalid for either the membership level or the day of
//the week, display an error message.
//Finally, prompt the user to enter the total amount of their purchase, apply
//the appropriate discount,
//and display the final amount after the discount is applied.
//Discounts Summary:
//Bronze (5% on Tuesday/Thursday): purchase * 0.95
//Silver (10% on Wednesday/Saturday): purchase * 0.90
//Gold (15% except Sunday): purchase * 0.85
//Platinum (20% on all days): purchase * 0.80
import java.util.Scanner;
public class ECommerceSystem{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter their membership level
System.out.print("Enter Your Membership Level (1 for Bronze, 2 for Silver, 3 for Gold, 4 for Platinum): ");
int membershipLevel = scanner.nextInt();
// Enter the day of the week
System.out.print("Enter the day of the week (1 for Monday - 7 for Sunday): ");
int dayOfWeek = scanner.nextInt();
// Membership level and day of the week
if (membershipLevel < 1 || membershipLevel > 4 || dayOfWeek < 1 || dayOfWeek > 7) {
System.out.println("Invalid Membership Level Or Day Of The Week. Please Enter A Valid Value.");
} else {
// Enter the total amount of purchase
System.out.print("Enter the total amount of your purchase: ");

double purchaseAmount = scanner.nextDouble();
double finalAmount = purchaseAmount;
double discount = 0.0;
switch (membershipLevel) {
case 1: // Bronze:5% discount on Tuesdays and Thursdays
if (dayOfWeek == 2 || dayOfWeek == 4) {
discount = 0.05;
}
break;
case 2: // Silver:10% discount on Wednesdays and Saturdays
if (dayOfWeek == 3 || dayOfWeek == 6) {
discount = 0.10;
}
break;
case 3: // Gold:15% discount on any day except Sundays
if (dayOfWeek != 7) {
discount = 0.15;
}
break;
case 4: // Platinum:20% discount on all days
discount = 0.20;
break;
}
// Apply discount
if (discount > 0.0) {
finalAmount = purchaseAmount * (1 - discount);
System.out.println("Discount Applied: " + (discount * 100) + "%");
} else {
System.out.println("No Discount Applied for membership level and day.");
}
// Final amount after the discount
System.out.printf("The final amount after the discount is:" +finalAmount);
}
scanner.close();
}
}