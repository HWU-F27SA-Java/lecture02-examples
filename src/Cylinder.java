/*
 * This class calculates and prints the volume of
 * of a cylinder by asking the radius and the height
 */
//-------------------------------------------------------------

import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("This programme calculates for you the volume of a cylinder");
		
		System.out.print("What is the radius? ");
		double radius = scan.nextFloat();

		System.out.print("What is the height? ");
		double height = scan.nextFloat();

		//calculate the volume
		double volume = Math.PI * radius * radius * height;

		System.out.print("The volume of cyclinder (Radius=" + radius + ", height= " + height +") = " + volume);

		scan.close();
	}
}
