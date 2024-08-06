package no03.nullProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  Create a stream of strings, adding 'z' at the beginning, and include null values.
 */
public class N02Nulls {
	
	public static void main(String[] args) {
		 List<String> inputStrings = Arrays.asList("abc", "12", null, "xyz", "a");

	        List<String> result = inputStrings.stream()
	                .map(s -> s == null ? null : "z" + s)
	                .collect(Collectors.toList());

	        System.out.println(result);
		
	}

}
