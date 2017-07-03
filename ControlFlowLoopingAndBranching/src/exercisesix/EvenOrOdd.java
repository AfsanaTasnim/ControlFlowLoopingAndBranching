package exercisesix;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int a = input.nextInt();
		
		System.out.println("The number you have entered is: " + a + ".");
		
		if(a%2 == 0) {
			System.out.println("This is an even number.");
		} else {
			System.out.println("This is an odd number.");
		}
		
	}

}
