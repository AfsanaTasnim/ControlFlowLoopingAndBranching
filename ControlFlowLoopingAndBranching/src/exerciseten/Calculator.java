package exerciseten;
import java.util.Scanner;

public class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		int choice;
		
		do {
			System.out.println("Please choice: ");
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			System.out.println("0 for quit.");
			choice = input.nextInt();
			
			System.out.println("Enter a number: ");
			int a = input.nextInt();
			System.out.println("Enter another number: ");
			int b = input.nextInt();
			
			switch(choice) {
				case 1:
					int result = calculator.add(a, b);
					System.out.println("Your result: " + result);
					break;
				case 2:
					int result2 = calculator.subtract(a, b);
					System.out.println("Your result: " + result2);
					break;
				case 3:
					int result3 = calculator.multiply(a, b);
					System.out.println("Your result: " + result3);
					break;
				case 4:
					int result4 = calculator.divide(a, b);
					System.out.println("Your result: " + result4);
					break;
				
					
			}
		} while(choice != 0);

	}

}
