package no13.map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Map {

	/*
	 all upper case
	 all
	 */
	public static void main(String[] args) {
		
		List<String> words4 = Arrays.asList("apple", "banana", "cherry");
		List<String> uppercaseWords = words4.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Uppercase Words: " + uppercaseWords);
		
		List<String> fruits = Arrays.asList("apple", "banana", "cherry");
		List<Character> firstCharacters = fruits.stream().map(s -> s.charAt(0)).collect(Collectors.toList());
		System.out.println("First Characters: " + firstCharacters);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> multipliedByTwo = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println("Multiplied by Two: " + multipliedByTwo);
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doubles = integers.stream().map(Integer::doubleValue).collect(Collectors.toList());
		System.out.println("Doubles: " + doubles);
		
		List<LocalDate> dates = Arrays.asList(LocalDate.now(), LocalDate.now().plusDays(1), LocalDate.now().plusDays(2));
		List<String> formattedDates = dates.stream().map(date -> date.format(DateTimeFormatter.ISO_DATE)).collect(Collectors.toList());
		System.out.println("Formatted Dates: " + formattedDates);
		
		List<Double> numbers1 = Arrays.asList(4.0, 9.0, 16.0, 25.0);
		List<Double> squareRoots = numbers1.stream().map(Math::sqrt).collect(Collectors.toList());
		System.out.println("Square Roots: " + squareRoots);
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		List<Integer> nameLengths = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Name Lengths: " + nameLengths);
		
		List<String> phrases = Arrays.asList("Hello", " ", "world", "!");
		String concatenatedPhrase = phrases.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println("Concatenated Phrase: " + concatenatedPhrase);
		
		
		List<Integer> binaryNumbers = Arrays.asList(5, 10, 15, 20);
		List<String> binaryRepresentations = binaryNumbers.stream().map(Integer::toBinaryString).collect(Collectors.toList());
		System.out.println("Binary Representations: " + binaryRepresentations);
		
		
		List<String> words1 = Arrays.asList("java", "stream", "example");
		List<Character> allCharacters = words1.stream().flatMapToInt(String::chars).mapToObj(c -> (char) c).collect(Collectors.toList());
		System.out.println("All Characters: " + allCharacters);
		
		List<String> words2 = Arrays.asList("one", "two", "three", "four");
		String result = words2.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
		System.out.println("Uppercase and Joined: " + result);
		
		List<LocalDate> dates1 = Arrays.asList(LocalDate.now(), LocalDate.now().plusDays(1), LocalDate.now().plusDays(2));
		List<String> dayOfWeeks = dates1.stream().map(date -> date.getDayOfWeek().toString()).collect(Collectors.toList());
		System.out.println("Day of Week: " + dayOfWeeks);
	
		
		
		/*
toUpperCase()
============
Converts all characters in the string to uppercase.
Example: "apple".toUpperCase() -> "APPLE"


toLowerCase()
============
Converts all characters in the string to lowercase.
Example: "APPLE".toLowerCase() -> "apple"

trim()
============
Removes leading and trailing whitespace.
Example: " apple ".trim() -> "apple"

substring(int beginIndex)
========================
Returns a new string that is a substring starting from the specified index.
Example: "apple".substring(1) -> "pple"


substring(int beginIndex, int endIndex)
================================================
Returns a new string that is a substring starting from the beginIndex and ending at endIndex.
Example: "apple".substring(1, 4) -> "ppl"



replace(char oldChar, char newChar)
====================================
Replaces all occurrences of a specified character with a new character.
Example: "apple".replace('p', 'b') -> "abble"


replace(CharSequence target, CharSequence replacement)
============================================================
Replaces all occurrences of a specified character sequence with a new character sequence.
Example: "apple".replace("pp", "bb") -> "abble"



concat(String str)
========================
Concatenates the specified string to the end of the current string.
Example: "apple".concat(" pie") -> "apple pie"


split(String regex)
========================
Splits the string around matches of the given regular expression.
Example: "apple,banana,cherry".split(",") -> ["apple", "banana", "cherry"]


charAt(int index)
========================
Returns the character at the specified index.
Example: "apple".charAt(1) -> 'p'

length()
===============================
Returns the length of the string.
Example: "apple".length() -> 5


startsWith(String prefix)
========================
Checks if the string starts with the specified prefix.
Example: "apple".startsWith("ap") -> true


endsWith(String suffix)
========================
Checks if the string ends with the specified suffix.
Example: "apple".endsWith("le") -> true

contains(CharSequence s)
========================
Checks if the string contains the specified character sequence.
Example: "apple".contains("pp") -> true

isEmpty()
========================
Checks if the string is empty.
Example: "".isEmpty() -> true

matches(String regex)
========================
Tells whether or not this string matches the given regular expression.
Example: "apple".matches("a.*e") -> true
		 */
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		List<Boolean> collect = words.stream().map(String::isEmpty).collect(Collectors.toList());System.out.println("isEmpty ::"+collect);
		List<Boolean> collect2 = words.stream().map(String::isBlank).collect(Collectors.toList());System.out.println("isBlank ::"+collect2);
		List<String> collect3 = words.stream().map(String::toUpperCase).collect(Collectors.toList());System.out.println("toUpperCase ::"+collect3);
		List<String> collect4 = words.stream().map(String::toLowerCase).collect(Collectors.toList());System.out.println("toLowerCase ::"+collect4);
		words.stream().map(String::toCharArray).forEach(System.out::println);
		List<Character> collect5 = words.stream().flatMap(word->word.chars().mapToObj(c->(char)c)).collect(Collectors.toList());
		List<byte[]> collect7 = words.stream().map(String::getBytes).collect(Collectors.toList());System.out.println("getBytes ::"+collect7);
		List<Integer> collect8 = words.stream().map(String::length).collect(Collectors.toList());System.out.println("length ::"+collect8);








		
	}

}
