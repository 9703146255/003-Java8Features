package no03.nullProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 Concatenate 'ABC' to strings with length less than 3 and replace null values with 'NULL'.
 */
public class N03Nulls {
	
	public static void main(String[] args) {
		
		 
		 
		 String[] array= {"thiru","sreenath","abc"," ",null,"bb","cc","dd",null,"f"};
		 
		 List<String> collect = Arrays.stream(array).filter(s->Optional.ofNullable(s).map(x->x.length()<3).orElse(true)).collect(Collectors.toList());
		 List<String> collect2 = collect.stream().map(s->s==null ? "NULL" : "ABC"+s).collect(Collectors.toList());
		 
		 
		 System.out.println(collect);
		 System.out.println(collect2);

	       
		
	}

}
