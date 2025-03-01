import java.util.Scanner;
public class TemperatureConvert{
    public static void main(String[] args) {
   Scanner Input = new Scanner(System.in);
   System.out.println("Enter Fahrenheit Number");
        float fah1 = Input.nextFloat();
   //Calculate Celsius
   float cel =(fah1 - 32) * 5 / 9;
       System.out.println("The Celsius is: " +cel);
   Input.close();
   }
}