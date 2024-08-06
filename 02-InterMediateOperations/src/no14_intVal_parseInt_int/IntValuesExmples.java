package no14_intVal_parseInt_int;

public class IntValuesExmples {

	private static void intValues1() {
		Integer numberObject = Integer.valueOf(123);
		int number = numberObject.intValue();
		System.out.println(number); // Output: 123(int)
	}

	private static void intValues2() {
		Integer a = Integer.valueOf(10);
		Integer b = Integer.valueOf(20);
		int sum = a.intValue() + b.intValue();
		System.out.println(sum); // Output: 30

	}

	private static void intValues3() {
		Integer ageObject = Integer.valueOf(18);
		int age = ageObject.intValue();
		if (age >= 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Minor");
		}
		// Output: Adult

	}

	private static void intValues4() {
		Integer[] numberObjects = { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) };
		for (Integer numberObject : numberObjects) {
			System.out.println(numberObject.intValue());
		}
		// Output: 1 2 3

	}

	public static void main(String[] args) {

		intValues1();
		intValues2();
		intValues3();
		intValues4();
	}

}
