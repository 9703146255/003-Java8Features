package no14_intVal_parseInt_int;

public class ParseIntegerExamples {

	private static void parseExample1() {
		String numberString = "123";
		int number = Integer.parseInt(numberString);
		System.out.println(number); // Output: 123

	}

	private static void parseExample2() {
		String hexString = "7B";
		int number = Integer.parseInt(hexString, 16);
		System.out.println(number); // Output: 123

	}

	private static void parseExample3() {
		String binaryString = "1101";
		int number = Integer.parseInt(binaryString, 2);
		System.out.println(number); // Output: 13

	}

	private static void parseExample4() {
		String negativeString = "-456";
		int number = Integer.parseInt(negativeString);
		System.out.println(number); // Output: -456

	}

	private static void parseExample5() {
		String numberStringWithSpaces = "   789   ";
		int number = Integer.parseInt(numberStringWithSpaces.trim());
		System.out.println(number); // Output: 789

	}

	public static void main(String[] args) {

		parseExample1();
		parseExample2();
		parseExample3();
		parseExample4();
		parseExample5();

	}

}
