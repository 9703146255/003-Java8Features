package no03.nullProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
   
  Problem 2: Filter out strings with length greater than 5, and replace null values with an empty string.
 */
public class N00Nulls {
	
	public static void main(String[] args) {
		
		String[] array= {"thiru","sreenath","abc"," ",null,"bb","cc","dd",null,"f"};
		
		List<String> collect = Arrays.stream(array).filter(s->Optional.ofNullable(s).map(x->x.length()<4).orElse(true)).collect(Collectors.toList());
		System.out.println(collect);
		
		
		// string is length < 4 include null value as well and we need to add z at the beginning
		
		List<String> collect2 = Arrays.stream(array).filter(s->Optional.ofNullable(s).map(x->x.length()<4).orElse(true)).collect(Collectors.toList());
		
		List<String> collect3 = collect2.stream().map(s->s==null ? null : "z"+s).collect(Collectors.toList());
		System.out.println(collect3);
		
		
		
		
		
		
	}

}
