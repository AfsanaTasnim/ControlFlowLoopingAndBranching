package exerciseeight;

public class SeriesOne {

	public static void main(String[] args) {
		
		double a = (1.00 / 2.00);
		double b = 1.00;
		double c = 0.00;
		
		for(int i = 2; i <= 1000; i++) {
			
			a = a + (1.00 / i);
		}
		
		c = a + b;
		System.out.println("The result of the series is: " + c + ".");
		
		

	}

}
