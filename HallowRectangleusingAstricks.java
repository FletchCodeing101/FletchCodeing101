import java.util.Scanner;//user input to make this lab easier
public class HallowRectangleusingAstricks {
    public static void main (String [] args){
     
    Scanner scanner = new Scanner(System.in);
     
    //user input for the rows aswell as the columns
     
    System.out.println("Hello User! Below You Will Enter A Number For Both The Rows And The Columns You Want To Build Your Rectangle With.");
     
    System.out.print("Enter the number of rows: ");
     
    int rows = scanner.nextInt();//since its user input you have to declare the variable like this so it allows the user to type the rows aswell as the columns
     
    System.out.print("Enter the number of columns: ");
     
    int columns = scanner.nextInt();
     
    System.out.println("Your Hollow Rectangle Based On Your Row And Column Numbers!:");
     
    // Use a foor loop to add the astricks in rows and columns of your choice
     
    for (int i = 0; i < rows; i++) {//i = 0 and i is less than the number of rows inputed by the user with an increment of 1/+1
     
    for (int j = 0; j < columns; j++) {//j is used for the columns which also adds one for the columns
     
    if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {//The if statement is used to basically specify where the astricks would be printed specifically using ||(or) and ==(equals)
     
    System.out.print("*");
     
    } else {
     
    System.out.print(" ");
     
    }
     
    }
     
    System.out.println(); //Learned this today on the right angles. It moves the lines to the next addign spaces
     
    }
     
    scanner.close();//Always close the Scanner
     
    }
    
}
