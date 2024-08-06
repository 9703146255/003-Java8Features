package no08.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
  Filters elements based on a given predicate.
filter(predicate)
 */
public class Filter {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenNumbers);
		
		
		String sentence = "The quick brown fox jumps over the lazy dog";
		List<String> longWords = Arrays.stream(sentence.split("\\s+")).filter(word -> word.length() > 4).collect(Collectors.toList());
		System.out.println("Long Words: " + longWords);
	
	
		List<Double> prices = Arrays.asList(10.5, 20.0, 15.75, 30.0, 25.5);
		List<Double> highPrices = prices.stream().filter(price -> price > 20.0).collect(Collectors.toList());
		System.out.println("High Prices: " + highPrices);
	
		List<Character> charsList = Arrays.asList('a', 'b', 'c', 'd', 'e');
		List<Character> vowels = charsList.stream().filter(c -> "aeiou".indexOf(c) != -1).collect(Collectors.toList());
		System.out.println("Vowels: " + vowels);
		
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		List<String> longStrings = strings.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		System.out.println("Long Strings: " + longStrings);
		
		
		//index of method
		//NOTE :: [ indexOf('o') ==> 	Its return index of first element]
		//NOTE :: [str.lastIndexOf('o'); ==>	Its return index of last elament]
		String str = "hello world";
		int index = str.indexOf('o'); // Returns 4, the position of the first 'o'
		int index1 = str.lastIndexOf('o'); // Returns 7, the position of the first 'o'
		System.out.println("Index of 'o': " + index);
		System.out.println("last Index of 'o': " + index1);
		
		
		//IF ELEMENT IS NOT THERE ITS RETURN -1
		
		System.out.println("Index of 'z': " + str.indexOf('z'));
		System.out.println("last Index of 'z': " + str.lastIndexOf('z'));
		
		/*
int index = str.indexOf('o'); // Returns 4, the position of the first 'o'
int index = str.indexOf("world"); // Returns 6, the position of the substring "world"
int index = str.indexOf('o', 5); // Returns 7, the position of the 'o' after index 5  //  Finding the position of a character starting from a specific index:
int index = str.indexOf("hello", 6); // Returns 12, the position of the substring "hello" after index 6 //String str = "hello world hello";



		 */


	
	
	
	}
	
	

}
