import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        //Initialize User and Password
        String correctUsername = "FletchIsTheGreatest";
        String correctPassword = "Biscuit3785";
        //Enter User and Password
        System.out.println("Enter Username");
        String username = Input.nextLine();
        System.out.println("Enter Password");
        String password = Input.nextLine();

        //Intialize the Username and Password
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful.");
        } else if (username.equals(correctUsername)) {
            System.out.println("Password Incorrect.");
        } else {
            System.out.println("User not found.");
        }
        
        Input.close();
    }
}