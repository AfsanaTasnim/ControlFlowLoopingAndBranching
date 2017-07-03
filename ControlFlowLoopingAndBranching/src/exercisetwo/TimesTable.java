package exercisetwo;

import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int a = input.nextInt();
		
		System.out.println("The times table of " + a + " is given below: ");
		System.out.println();
		
		for(int i = 0; i <=10; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}

	}

}
