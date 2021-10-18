package oopsday1;

public class EqualsAndCompareTo {

	static final int ZERO = 0, ONE = 1;

	static void checkLine() {

	}

	public static void main(String[] args) {

		System.out.println("Eneter the first line points value");
		Point p1 = new Point();
		p1.x = p1.scanInput();
		p1.y = p1.scanInput();
		Point p2 = new Point();
		p2.x = p2.scanInput();
		p2.y = p2.scanInput();
		System.out.println("Enter the second line point value");
		Point p3 = new Point();
		p3.x = p3.scanInput();
		p3.y = p3.scanInput();
		Point p4 = new Point();
		p4.x = p4.scanInput();
		p4.y = p4.scanInput();

		EqualityLine l1 = new EqualityLine();
		l1.p1 = p1;
		l1.p2 = p2;

		EqualityLine l2 = new EqualityLine();
		l2.p3 = p3;
		l1.p4 = p4;

		float lineOne = l1.lineLength(p1.x, p1.y, p2.x, p2.y);
		String lineFirst = Float.toString(lineOne);
		float lineTwo = l1.lineLength(p3.x, p3.y, p4.x, p4.y);
		String lineSecond = Float.toString(lineOne);
		int finalvalue = lineFirst.compareTo(lineSecond);
		float checkValue = Float.compare(lineOne, lineTwo); // used Wrapper class
		if (checkValue == ZERO)
			System.out.println("Both line are equal");
		else if (checkValue > ZERO)
			System.out.println("the line are grater");
		else
			System.out.println("The line two are grater");
	}

}
