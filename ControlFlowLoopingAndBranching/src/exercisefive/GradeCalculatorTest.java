package exercisefive;

public class GradeCalculatorTest {

	public static void main(String[] args) {
		int number = 85;
		GradeCalculator calculator = new GradeCalculator();
		String grade = calculator.calculate(number);
		System.out.println("Your Grade is: " + grade);

	}

}
