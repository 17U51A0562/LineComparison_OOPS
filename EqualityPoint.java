package oopsday1;

import java.util.Scanner;

public class EqualityPoint {
	public int x;
	public int y;
	public int x1;
	public int y1;

	
	public int scanInput() {
		Scanner scannerobj = new Scanner(System.in);
		System.out.println("Enter the value of points");
		int userInput = scannerobj.nextInt();
		return userInput;
	}

}
