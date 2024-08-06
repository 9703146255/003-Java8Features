package in.thiru;

import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 String inputString = "Java Concept Of The Day";
 */
public class Test {
	
	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day";
		
		List<Entry<Character, Long>> list = inputString
		.chars()
		.mapToObj(c->(char)c)
		.filter(s->!Character.isWhitespace(s))
		.map(Character::toLowerCase)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.toList();
		
		for (Entry<Character, Long> entry : list) 
		{
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}
		
		

	}

}
