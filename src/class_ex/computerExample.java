package class_ex;

public class computerExample {

	public static void main(String[] args) {
		computer com1 = new computer();
		
		int[] values = {1,2,3};
		int result1 = com1.sum1(values);
		System.out.println("result = "+result1);
		
		int result2 = com1.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 ="+result2);
		
		int[] values2 = {1,2,3,4,5};
		int result3 = com1.sum2(values2);
		System.out.println("result3 ="+result3);
		
		int result4 = com1.sum2(1,2,3,4,5);

	}

}
