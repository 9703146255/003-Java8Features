package N11.nonmatch;

import java.util.Arrays;
import java.util.List;

public class NonMatch {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
		boolean noneEven = numbers.stream().noneMatch(n -> n % 2 == 0);
		System.out.println("None are Even: " + noneEven);
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		boolean noneStartWithZ = words.stream().noneMatch(s -> s.startsWith("z"));
		System.out.println("None Start with 'z': " + noneStartWithZ);
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
		boolean noneCheap = prices.stream().noneMatch(p -> p < 10.0);
		System.out.println("None are Cheap: " + noneCheap);
		
		List<Character> chars = Arrays.asList('a', 'e', 'i', 'o', 'u');
		boolean noneConsonants = chars.stream().noneMatch(c -> "aeiou".indexOf(c) == -1);
		System.out.println("None are Consonants: " + noneConsonants);
		
		List<String> strings = Arrays.asList("apple", "apricot", "avocado");
		boolean noneEndWithZ = strings.stream().noneMatch(s -> s.endsWith("z"));
		System.out.println("None End with 'z': " + noneEndWithZ);
	}

}
