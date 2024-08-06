package in.thiru;

import java.util.List;
import java.util.stream.Collectors;

public class N12CheckGivenStringsAreAnagramOrNot {
	
	public static void main(String[] args) {
		String name1="listen";
		String name2="silent";
	    
		List<Integer> collect = name1.chars().sorted().boxed().collect(Collectors.toList());
		
		
		
		boolean areEquals = name1.chars().sorted().boxed().collect(Collectors.toList()).equals(name2.chars().sorted().boxed().collect(Collectors.toList()));
		System.out.println(areEquals);
		if(areEquals)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
