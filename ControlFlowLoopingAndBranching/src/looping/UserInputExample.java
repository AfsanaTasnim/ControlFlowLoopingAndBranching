package looping;
import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean okay = true;
		
		do {
			System.out.println("Enter a line: ");
			String a = input.nextLine();
			System.out.println("You entered: " + a);
			if("quit".equals(a)) {
				okay = false;
			}
		} while(okay);

	}

}
