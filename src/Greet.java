
/*This programme demonstrates the use of the Scanner class
 * Scanner is a class that comes with Java
 * It is used for reading data from the keyboard
 */
import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		System.out.print("Please type in your name ?");
		//creating a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		//reading the next line from the keyboard
		String name = keyboard.nextLine();
		
		//make a greeting sentence and put it to the screen
		String greeting = "Hello, " + name + "!";
		System.out.println(greeting);
		
		//closing the scanner object: meaning finish to use it
		keyboard.close();
	}

}
