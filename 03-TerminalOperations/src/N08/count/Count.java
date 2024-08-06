package N08.count;

import java.util.Arrays;
import java.util.List;

public class Count {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		long count = numbers.stream().count();
		System.out.println("Number of Elements: " + count);
		
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		long wordCount = words.stream().count();
		System.out.println("Number of Words: " + wordCount);
		
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
		long priceCount = prices.stream().count();
		System.out.println("Number of Prices: " + priceCount);
		
		
		List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e');
		long charCount = chars.stream().count();
		System.out.println("Number of Characters: " + charCount);
		
		
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		long shortWordCount = strings.stream().filter(s -> s.length() < 6).count();
		System.out.println("Number of Short Words: " + shortWordCount);
		
	}

}
