package no01.maptoint;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;

public class maptoint2 {
	
	public static void main(String[] args) {
		
		//note :: with summeraized & without summeraized both having:: max(), min(), sum(), average(), count()
		
		//sting to long for sum
		List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
		long sum = strings.stream().mapToLong(Long::parseLong).sum();
		System.out.println("Sum: " + sum);
		
		
		//string to long for sum
		List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
		double sum1 = doubles.stream().mapToDouble(Double::intValue).sum();
		System.out.println("Sum: " + sum1);
		
		
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		double average = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println("Average: " + average);
		
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		double totalLength = words.stream().mapToDouble(String::length).sum();
		System.out.println("Total Length: " + totalLength);
		
		
		
		List<Character> chars = Arrays.asList('a', 'b', 'c');
		double sumAscii = chars.stream().mapToDouble(c -> (int) c).sum();
		System.out.println("Sum of ASCII values: " + sumAscii);
	}

}
