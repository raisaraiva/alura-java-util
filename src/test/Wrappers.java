package test;

public class Wrappers {

	public static void test() {
		
		Integer valueInteger = Integer.valueOf(1);

		System.out.println(valueInteger.intValue());
		
		Double valueDouble = Double.valueOf(1.1);

		System.out.println(valueDouble.doubleValue());
		
		Boolean valueBoolean = Boolean.FALSE;

		System.out.println(valueBoolean.booleanValue());
		
		Number valueNumber = Float.valueOf(1.1f);

		System.out.println(valueNumber.doubleValue());
	}
}
