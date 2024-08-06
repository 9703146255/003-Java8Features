package no03.nullProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
  Create a stream of strings, convert them to uppercase, and add 'X' at the beginning.
 */
public class N04Nulls {
	
	public static void main(String[] args) {
		
		 
		 
		 String[] array= {"thiru","sreenath","abc"," ",null,"bb","cc","dd",null,"f"};
		 
		 List<String> result = Arrays.stream(array)
			        .map(s -> "X" + (s == null ? null : s.toUpperCase()))
			        .collect(Collectors.toList());
		 
		 System.out.println(result);
		
		

	       
		
	}

}
