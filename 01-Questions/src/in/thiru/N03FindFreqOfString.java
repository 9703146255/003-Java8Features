package in.thiru;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
  3) How do you find frequency of each character in a string using Java 8 streams?
 */
public class N03FindFreqOfString {
	
	public static void main(String[] args) {
		
		
//		//method-1
//		List<Character> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
//		System.out.println(collect);
//		Map<Character, Long> freqOfChar1 = collect.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(freqOfChar1);
	
//		//method-2
//		Map<Character, Long> freqOfChar2 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(freqOfChar2);
		

		
//		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
//		
		
		
		
		Map<Character, Long> collect = "hello".chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		System.out.println(collect);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
