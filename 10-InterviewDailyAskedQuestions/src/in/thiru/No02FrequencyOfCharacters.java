package in.thiru;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No02FrequencyOfCharacters {
	
	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day";
		Set<Entry<Character, Long>> entrySet = inputString.chars().mapToObj(c->(char)c)
		.map(Character::toLowerCase)
		.filter(s->!Character.isWhitespace(s))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet();
		for (Entry<Character, Long> entry : entrySet) 
		{
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}
		
		
		String inputString1 = "Java Concept Of The Day";
		
		Set<Entry<Character, Long>> entrySet2 = inputString1
		.chars()
		.mapToObj(c->(char)c)
		.map(Character::toLowerCase)
		.filter(s->!Character.isWhitespace(s))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet();
				
		
		
		
		
		
		
	}

	private static void practice1() {
		
		//practice1();
		String inputString = "Java Concept Of The Day";
		 Set<Entry<Character, Long>> S = inputString
		.chars()
		.mapToObj(c->(char)c)
		.filter(c->!Character.isWhitespace(c))
		.map(Character::toLowerCase)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet();
		 for (Entry<Character, Long> entry : S) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		 }
			
		 Map<Character, Long> charFrequency = 
				 		inputString.chars()
			            .mapToObj(c -> (char) c)
			            .filter(c -> !Character.isWhitespace(c))
			            .map(Character::toLowerCase)
			            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			System.out.println("=====================================================");
			 charFrequency.forEach((key, value) -> System.out.println(key + " " + value));
	}

}
