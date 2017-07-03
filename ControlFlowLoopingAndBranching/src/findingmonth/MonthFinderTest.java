package findingmonth;

import java.util.Scanner;

public class MonthFinderTest {

	public static void main(String[] args) {
		MonthFinder c = new MonthFinder();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the month in which you were born: ");
		int month = input.nextInt();
		
		String a = c.findMonth(month);
		
		System.out.println("The month is: " + a + ".");

	}

}
