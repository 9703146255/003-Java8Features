package N06.min;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Min {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
		Optional<Integer> min = numbers.stream().min(Integer::compareTo);
		System.out.println("Min: " + min.orElse(0));
		
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		Optional<String> minByLength = words.stream().min(Comparator.comparingInt(String::length));
		System.out.println("Min By Length: " + minByLength.orElse(""));
		
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75);
		Optional<Double> minPrice = prices.stream().min(Double::compareTo);
		System.out.println("Min Price: " + minPrice.orElse(0.0));
		
		
		List<Character> chars = Arrays.asList('a', 'b', 'c');
		Optional<Character> minChar = chars.stream().min(Comparator.naturalOrder());
		System.out.println("Min Char: " + minChar.orElse(' '));
		
		
		
		List<LocalDate> dates = Arrays.asList(LocalDate.now(), LocalDate.now().plusDays(1), LocalDate.now().plusDays(2));
		Optional<LocalDate> minDate = dates.stream().min(Comparator.naturalOrder());
		System.out.println("Min Date: " + minDate.orElse(LocalDate.now()));
	}

}
