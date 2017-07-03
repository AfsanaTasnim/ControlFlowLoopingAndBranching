package exerciseseven;

public class SwitchTest {

	public static void main(String[] args) {
		SwitchTest ms = new SwitchTest();
		ms.doCalculate();

	}
	
	public void doCalculate() {
		int number = 1;
		switch(number) {
			default: 
				System.out.println("This is the default output.");
				break;
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
		}
		
	}

}
