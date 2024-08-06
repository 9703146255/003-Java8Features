package in.thiru.intstream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class No01IntStream {
	/*
	 * IntStream itself is neither an intermediate nor a terminal operator. It is a
	 * type of stream that provides a sequence of primitive int values and includes
	 * both intermediate and terminal operations.
	 * 
	 * Note:: if we use both =====================
	 * intStream.forEach(s->System.out.println(s));
	 * intStream.forEach(System.out::println)
	 * 
	 * we will get like:: ================== Exception in thread "main"
	 * java.lang.IllegalStateException: stream has already been operated upon or
	 * closed
	 */
	public static void main(String[] args) {
//		example1();
//		example2Rangefrom1To10();
//		intStreamToStreamOfIntegers();

//		intRangeSum();

		IntStream.range(1, 5).forEach(System.out::println); // Prints 1, 2, 3, 4
		IntStream.rangeClosed(1, 5).forEach(System.out::println); // Prints 1, 2, 3, 4, 5

		// 7. How do you filter even numbers from an IntStream? Provide an example.
		IntStream.range(1, 10).filter(n -> n % 2 == 0).forEach(System.out::println); // Prints 2, 4, 6, 8
		// 8. Demonstrate how to use the map function with IntStream to square each
		// element in the stream.
		IntStream.range(1, 5).map(n -> n * n).forEach(System.out::println); // Prints 1, 4, 9, 16

		// 10. How can you collect the elements of an IntStream into a list?
		List<Integer> list = IntStream.range(1, 5).boxed().collect(Collectors.toList());
		System.out.println(list); // Prints [1, 2, 3, 4]

		/*
		 * Initial Step:
		 * 
		 * a = 1 b = 1 a * b => 1 * 1 = 1 Second Step:
		 * 
		 * a = 1 b = 2 a * b => 1 * 2 = 2 Third Step:
		 * 
		 * a = 2 b = 3 a * b => 2 * 3 = 6 Fourth Step:
		 * 
		 * a = 6 b = 4 a * b => 6 * 4 = 24 Final Result:
		 * 
		 * 24
		 */
		int product = IntStream.rangeClosed(1, 4).reduce(1, (a, b) -> a * b);
		System.out.println("Product: " + product); // Prints 24
		
		
	//	12. Explain the use of IntStream.generate() with an example that generates an infinite stream of random integers.
		Random random = new Random();
		IntStream.generate(random::nextInt)
		         .limit(5) // Limit to 5 elements for demonstration
		         .forEach(System.out::println);
//		13. How can you limit an infinite IntStream to a fixed number of elements? Provide an example.
		IntStream.iterate(1, n -> n + 1)
        .limit(5)
        .forEach(System.out::println); // Prints 1, 2, 3, 4, 5
		
		
		int sum = IntStream.range(1, 1000000)
                .parallel()
                .sum();
System.out.println("Sum: " + sum);


	}

	private static void intRangeSum() {
		// 4. What method would you use to find the sum of all elements in an IntStream?
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
	}

	private static void intStreamToStreamOfIntegers() {
		// 3. How can you convert an IntStream to a Stream<Integer>?
		IntStream rangeClosed = IntStream.rangeClosed(1, 10);
		Stream<Integer> boxed = rangeClosed.boxed();
		boxed.forEach(s -> System.out.println(s));
	}

	private static void example2Rangefrom1To10() {
		// 2.How do you create an IntStream that generates a sequence of numbers from 1
		// to 10?
		IntStream rangeClosed = IntStream.rangeClosed(1, 10);
		rangeClosed.forEach(s -> System.out.print(s + " "));
	}

	private static void example1() {
		// 1.How do you create an IntStream from an array of integers? Provide an
		// example.
		int[] numbers = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(numbers);
		System.out.println(intStream);
		intStream.forEach(s -> System.out.println(s));
		intStream.forEach(System.out::println);
	}

}
