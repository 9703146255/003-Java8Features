package N10.allmatch;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
		System.out.println("All Even Numbers: " + allEven);
		
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		boolean allStartWithA = words.stream().allMatch(s -> s.startsWith("a"));
		System.out.println("All Words Start with 'a': " + allStartWithA);
		
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
		boolean allExpensive = prices.stream().allMatch(p -> p > 10.0);
		System.out.println("All Prices are Expensive: " + allExpensive);
		
		
		List<Character> chars = Arrays.asList('a', 'e', 'i', 'o', 'u');
		boolean allVowels = chars.stream().allMatch(c -> "aeiou".indexOf(c) != -1);
		System.out.println("All are Vowels: " + allVowels);
		
		List<String> strings = Arrays.asList("apple", "apricot", "avocado");
		boolean allStartWithA1 = strings.stream().allMatch(s -> s.startsWith("a"));
		System.out.println("All Strings Start with 'a': " + allStartWithA1);
	}

}
