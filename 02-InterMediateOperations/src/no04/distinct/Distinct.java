package no04.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
	
	public static void main(String[] args) {
		//unique integers
		//unique string
		//unique double
		//unique characters
		//unique integer count
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 4, 2, 5);
		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Numbers: " + distinctNumbers);
		
		
		
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry");
		List<String> uniqueWords = words.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Words: " + uniqueWords);
		
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 10.5, 15.75);
		List<Double> uniquePrices = prices.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Prices: " + uniquePrices);
		
		
		List<Character> chars = Arrays.asList('a', 'b', 'c', 'a', 'b');
		List<Character> uniqueChars = chars.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Characters: " + uniqueChars);
		
		
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		long distinctCount = numbers1.stream().distinct().count();
		System.out.println("Number of Distinct Elements: " + distinctCount);
	}

}
