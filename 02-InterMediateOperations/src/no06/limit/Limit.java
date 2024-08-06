package no06.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 Truncates the stream to a specified size.
 limit(size)
 */
public class Limit {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> limitedList = numbers.stream().limit(5).collect(Collectors.toList());  
		System.out.println("Limited List: " + limitedList);
		
		
		String sentence = "The quick brown fox jumps over the lazy dog";
		List<String> wordsList = Arrays.asList(sentence.split(" "));
		List<String> limitedWords = wordsList.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limited Words: " + limitedWords);
		
		
		List<Double> pricesList = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
		List<Double> limitedPrices = pricesList.stream().limit(2).collect(Collectors.toList());
		System.out.println("Limited Prices: " + limitedPrices);
		
		
		List<Character> charsList = Arrays.asList('a', 'b', 'c', 'd', 'e');
		List<Character> limitedChars = charsList.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limited Characters: " + limitedChars);
		
		
		List<String> fruitsList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		List<String> limitedStrings = fruitsList.stream().limit(4).collect(Collectors.toList());
		System.out.println("Limited Strings: " + limitedStrings);
		
		
		
	}

}
