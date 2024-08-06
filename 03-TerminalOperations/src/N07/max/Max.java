package N07.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Max {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
		System.out.println("Max: " + max.orElse(0));
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		Optional<String> maxByLength = words.stream().max(Comparator.comparingInt(String::length));
		System.out.println("Max By Length: " + maxByLength.orElse(""));
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75);
		Optional<Double> maxPrice = prices.stream().max(Double::compareTo);
		System.out.println("Max Price: " + maxPrice.orElse(0.0));
		
		
		List<Character> chars = Arrays.asList('a', 'b', 'c');
		Optional<Character> maxChar = chars.stream().max(Comparator.naturalOrder());
		System.out.println("Max Char: " + maxChar.orElse(' '));
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		Optional<String> maxByNameLength = names.stream().max(Comparator.comparingInt(String::length));
		System.out.println("Max By Name Length: " + maxByNameLength.orElse(""));
	}

}
