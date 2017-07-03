package looping;

import java.util.Scanner;

public class NamtaWithLooping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int a = input.nextInt();
		
		int i = 0;
		
		while(i <= 10) {
			System.out.println(a + " * " + i + " = " + (a * i));
			i++;
		}

	}

}
