package N05.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "cherry");
		String concatenated = words.stream().collect(Collectors.joining(", "));
		System.out.println("Concatenated: " + concatenated);
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Squared Numbers: " + squaredNumbers);
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75);
		Double averagePrice = prices.stream().collect(Collectors.averagingDouble(Double::doubleValue));
		System.out.println("Average Price: " + averagePrice);
		
		
		List<String> words1 = Arrays.asList("apple", "banana", "cherry");
		Map<Integer, List<String>> groupedByLength = words1.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Grouped By Length: " + groupedByLength);
		
		
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
		String result = numbers2.stream().map(Object::toString).collect(Collectors.joining("-"));
		System.out.println("Joined: " + result);
	}

}
