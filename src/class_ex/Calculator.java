package class_ex;

public class Calculator {
	void PowerOn() {
		System.out.println("전원을 킵니다");
	}
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	void PowerOff() {
		System.out.println("전원을 끕니다");
	}
}
