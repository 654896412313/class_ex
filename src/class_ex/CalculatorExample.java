package class_ex;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.PowerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1 = "+result1);
		
		double result2 = myCalc.divide(10,3);
		System.out.println("result2 = "+ result2);
		myCalc.PowerOff();

	}

}
