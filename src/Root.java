/*
 * This class calculates and prints the square root
 * of a number read from the keyboard
 */
//-------------------------------------------------------------
/*
 * this instruction links to the existing class Scanner
 * Scanner has methods to read primitive values from the keyboard
 */
import java.util.Scanner;

public class Root {
	public static void main (String[] args){
		System.out.print("Please, type a number: ");
		Scanner scan = new Scanner(System.in);
		
		double number = scan.nextFloat();
		double root = Math.sqrt(number);
		
		System.out.println("Square root(" + number+") = " + root);
		scan.close();
	}
}
