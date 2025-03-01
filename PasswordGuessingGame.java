import java.util.Scanner;
public class PasswordGuessingGame {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//Initialize predefinedPassword
	String predefinedPassword = "Fletcherisnotalive404";
	//If false allow attempts
	boolean guessedCorrectly = false;
	//Allow user to enter 5 attempts
	for(int attempt = 1; attempt <= 5; attempt++) {
	    //Output the number of attempts aswell as a user input of the guessed password
	    System.out.print("Attempt " + attempt + ": Enter Password: ");
	    String usersGuess = scanner.nextLine();
	   //Intialize that if users guess equals predefined password would make guessed Correctly True
	    if(usersGuess.equals(predefinedPassword)) {
	        guessedCorrectly = true;
	        //Output the success of the users guess
	        System.out.println("Success. You guessed the password.");
	        break;
	    } else {
	        //If else then intialize that the password would be incorrect
	        System.out.println("Incorrect Password. Try again.");
	    }
	}
	if(!guessedCorrectly) {
	    //If the guessedCorrectly is any different after the 5 attempts output failure
	    System.out.println("Failure. You didnt guess password within 5 attempts.");
	}
	//close scanner
	scanner.close();
	}
}
