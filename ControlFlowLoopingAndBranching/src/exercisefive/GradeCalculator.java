package exercisefive;

public class GradeCalculator {
	public String calculate(int number) {
		if(number >= 80) {
			return "A+";
		} else if(number >= 75 & number < 80) {
			return "A";
		} else if(number >=70 & number < 75) {
			return "A-";
		} else if(number >= 65 & number < 70) {
			return "B+";
		} else if(number >= 60 & number < 65) {
			return "B";
		} else if(number >= 55 & number < 60) {
			return "B-";
		} else if(number >=50 & number <55) {
			return "C+";
		} else if(number >= 45 & number < 50) {
			return "C";
		} else if(number >=40 & number < 45) {
			return "D";
		} else {
			return "F";
		}
	}
}
