package in.thiru;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No03FrequencyOfWords {
	
	public static void main(String[] args) {
		//practice1();
		String message="hi hello how are you how do you do";

		
		Set<Entry<String, Long>> entrySet = Arrays
		.asList(message.split(" "))
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet();
		
		
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}
		
		
		//upper lowe letters
		
		String message1="hi hello how are you how do you do HI  hellO ,";
		Set<Entry<String, Long>> entrySet1 = 
		Arrays
		.asList(message1.split(" "))
		.stream()
		.map(String::toLowerCase)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet();
		
		
		for (Entry<String, Long> entry : entrySet1)
		{
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}

	private static void practice1() {
		String message="hi hello how are you how do you do";
		Set<Entry<String, Long>> entrySet = Arrays
		.asList(message.split(" "))
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet();
		
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey()+"      ::   "+entry.getValue());
		}
	}

}
