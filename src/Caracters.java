
/*
 * This class demonstrates the declaration of char variables
 * It also shows the literal notation of characters
 */
public class Caracters {
// Please note the use of single quote to enclose a literal character
	public static void main(String[] args) {
		//using the unicode code for a character
		char c1 = '\u00ef';
		//using escape sequence for a character
		char c2 = '\t';
		//using escape sequence for a character
		char c3 = '\n';
		//using ordinary representation 
		char c4 = 'A';
		char c5 = '\u00ff';
		//writing to the screen my characters
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("." + c3 + ".");
		System.out.println(c4);
		System.out.println(c5);

	}

}
