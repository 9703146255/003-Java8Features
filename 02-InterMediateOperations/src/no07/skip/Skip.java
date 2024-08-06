package no07.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 Skips the specified number of elements from the stream. from starting.
 skip(count) or  skip(size)
 
 skip(1)==> skip first 1 element
 skip(2)==> skip firs 2 elements skip()
 skip(3)==> skip firs 3 element skip()
 skip(4)==> skip firs 4 elements skip()
 skip(5)==> skip firs 5 element skip()
 skip(6)==> skip firs 6 elements skip()
 .
 .
 .
 .
 .
 */
public class Skip {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> skippedList = numbers.stream().skip(5).collect(Collectors.toList());
		System.out.println("Skipped List: " + skippedList);
		
		
		String sentence = "The quick brown fox jumps over the lazy dog";
		List<String> words = Arrays.asList(sentence.split("\\s+"));
		List<String> skippedWords = words.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skipped Words: " + skippedWords);
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
		List<Double> skippedPrices = prices.stream().skip(3).collect(Collectors.toList());
		System.out.println("Skipped Prices: " + skippedPrices);
		
		List<Character> chars = Arrays.asList('a', 'b', 'c', 'd', 'e');
		List<Character> skippedChars = chars.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skipped Characters: " + skippedChars);
		
		
		
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		List<String> skippedStrings = strings.stream().skip(3).collect(Collectors.toList());
		System.out.println("Skipped Strings: " + skippedStrings);
	}

}
