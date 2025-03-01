
//Declare a char variable and initialize it with a letter.
//Print the ASCII value of the character to the console (Hint: Characters are represented numerically).
//Declare a String variable and initialize it with a sentence.
//Use the String class methods (e.g., length(), charAt(), substring(), toUpperCase(), toLowerCase()) to perform various operations on the string. Print the results of each operation. For example:
//Print the length of the string.
//Print the character at a specific index.
//Print a substring of the string.
//Print the string in uppercase and lowercase.
public class CharacterandStringManipulation {
 
public static void main(String[] args) {
 
// Declare a char variable and initialize it with a letter
 
char letter = 'A';
 
// ASCII value of the character
 
int asciiValue = letter;
 
System.out.println("ASCII value of '" + letter + "' is: " + asciiValue);
 
// String variable initialized with a sentence
 
String sentence = "Java programming is fun!";
 
// length of the string
 
System.out.println("Length of the string: " + sentence.length());
 
// The character at a specific index
 
System.out.println("Character at index 5: " + sentence.charAt(5));
 
// A substring of the string
 
System.out.println("Substring (5 to 15): " + sentence.substring(5, 15));
 
// String in uppercase
 
System.out.println("Uppercase: " + sentence.toUpperCase());
 
// String in lowercase
 
System.out.println("Lowercase: " + sentence.toLowerCase());
 
}
}