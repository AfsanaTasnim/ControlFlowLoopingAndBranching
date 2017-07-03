package looping;

import java.util.Scanner;

public class NamtaWithForLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int a = input.nextInt();
		
		for(int i = 0; i<=10; i++) {
			System.out.println(a + " * " + i + " = " +a * i);
		}

	}

}
