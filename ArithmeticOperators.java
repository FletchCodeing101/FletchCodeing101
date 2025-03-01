//Declare two int variables and initialize them with different values.
//Perform the following arithmetic operations on these variables: addition, subtraction, multiplication, division, and modulus.
//Print the result of each operation to the console, clearly labeling what the operation is (e.g., "The sum is: 15").
//Declare two double variables and repeat steps 2 and 3. Observe the differences in the results, especially with division.
//Experiment with huge and very small integer and floating-point values. Observe what happens when you exceed a given data type's maximum or minimum values.
public class ArithmeticOperators {
 
public static void main(String[] args) {
 
System.out.println("The Original answers to the problems are below:");
 
int x = 15;
 
int y = 5;
 
int sum = x + y;
 
int sub = x - y;
 
int mult = x * y;
 
int div = x / y;
 
double mod = x % y;
 
System.out.println("The sum is: "+sum);
 
System.out.println("The difference is: "+sub);
 
System.out.println("The product is: "+mult);
 
System.out.println("The quotient is: "+div);
 
System.out.println("The remainder is: "+mod);
 
System.out.println("The answers to the double functions are Below:");
 
double x2 = 25.6;
 
double y2 = 13.4;
 
double sum2 = x2 + y2;
 
double sub2 = x2 - y2;
 
double mult2 = x2 * y2;
 
double div2 = x2 / y2;
 
double mod2 = x2 % y2;
 
System.out.println("The sum is: "+sum2);
 
System.out.println("The difference is: "+sub2);
 
System.out.println("The product is: "+mult2);
 
System.out.println("The quotient is: "+div2);
 
System.out.println("The remainder is: "+mod2);
 
}
}