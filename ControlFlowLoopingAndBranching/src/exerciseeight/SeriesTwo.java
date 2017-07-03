package exerciseeight;

public class SeriesTwo {

	public static void main(String[] args) {
		
		double a = -(1.00 / 3.00);
		double b = 1.00;
		double c = 0.00;
		
		
		for(int i = 5; i <= 1000; i = i+2) {
			a = a + (1.00 / i);
		}
		
		c = 4*(b + a);

		System.out.println("The result of the series is: " + c + ".");
	}

}
