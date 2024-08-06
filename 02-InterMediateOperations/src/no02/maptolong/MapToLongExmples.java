package no02.maptolong;

import java.util.Arrays;
import java.util.List;

public class MapToLongExmples {
	
	//note :: mapToInt,Long,Double
	//note2:: flatMapToInt,Long,Double
	private static void mapToLongExmple1()
	{
		List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
		long sum = strings.stream().mapToLong(Long::parseLong).sum();
		Double dsum = strings.stream().mapToDouble(Double::parseDouble).sum();
		strings.stream().mapToInt(Integer::parseInt).sum();
		strings.stream().mapToLong(Long::parseLong).sum();
		System.out.println("Sum: " + sum);
	}
	
	private static void mapToLongExmple2()
	{
		List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
		double sum = doubles.stream().mapToDouble(Double::doubleValue).sum();
		System.out.println("Sum: " + sum);
	}
	
	private static void mapToLongExmple3()
	{
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		double average = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println("Average: " + average);
	}
	
	private static void mapToLongExmple4()
	{
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		double totalLength = words.stream().mapToDouble(String::length).sum();
		System.out.println("Total Length: " + totalLength);
	}
	
	private static void mapToLongExmple5()
	{
		List<Character> chars = Arrays.asList('a', 'b', 'c');
		double sumAscii = chars.stream().mapToDouble(c -> (int) c).sum();
		System.out.println("Sum of ASCII values: " + sumAscii);
	}
	
	private static void flatMapToInt1()
	{
		List<List<Integer>> asList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(6,7,8));
		int sum = asList.stream().flatMapToInt(list->list.stream().mapToInt(Integer::intValue)).sum(); System.out.println("SUM OF THE FLAT MAP IS :: "+sum);
	}
	
	public static void main(String[] args) {
		mapToLongExmple1();
		mapToLongExmple2();
		mapToLongExmple3();
		mapToLongExmple4();
		mapToLongExmple5();
		
		System.out.println("---------------------");
		
		flatMapToInt1();
		
		System.out.println("---------------------");
	}

}
