package no03.peek;

import java.util.Arrays;
import java.util.List;
/*
 Allows performing a side effect on each element without changing them.
 
Logging:
========
Print or log each element as it passes through the stream.

Debugging:
==========
Check the elements of the stream at various stages to understand how they are being processed.

Side Effects:
============
Perform actions like updating external counters or collecting statistics without modifying the stream elements.

method-1
---------
peek(System.out::println).count()

method-2
---------
peek(x -> System.out.println("Processing: " + x)
peek(c -> System.out.println("Color: " + c)

 */
public class Peek1 {

	private static void peek1() {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		long count = words.stream().peek(System.out::println).count();
		System.out.println(count);
	}

	private static void peek2() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		long count2 = numbers
				.stream()
				.peek(x -> System.out.println("Processing: " + x))
				.count();
		System.out.println("Sum: " + count2);
	}

	private static void peek3() {
		List<String> colors = Arrays.asList("red", "green", "blue");
		long count3 = colors.stream().peek(c -> System.out.println("Color: " + c)).count();
		System.out.println("Count: " + count3);
	}

	private static void peek4() {

		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75);
		double totalPrice = prices.stream().peek(p -> System.out.println("Price: " + p)).count();
		System.out.println("Total Price: " + totalPrice);
	}

	private static void peek5() {
		List<Character> chars = Arrays.asList('a', 'b', 'c');
		long count = chars.stream().peek(c -> System.out.println("Character: " + c)).count();
		System.out.println("count of the characters are :: " + count);
	}

	public static void main(String[] args) {

		peek1();
		peek2();
		peek3();
		peek4();
		peek5();

	}

}
