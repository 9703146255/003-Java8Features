package no02.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/*
 Max element from the array
 */
public class N12RemoveNulls {

	public static void main(String[] args) {
		
		String str="hhello";
		
		
		Optional<Character> findFirst = str.chars().mapToObj(c->(char)c).distinct().findFirst();
		
		if(findFirst.isPresent())
		{
			Character character = findFirst.get();
			System.out.println("first not-repeated :: "+character);
		}

		
		List<Character> collect = str.chars().mapToObj(c->(char)c).distinct().collect(Collectors.toList());
		
		Map<Integer, List<Character>> collect2 = collect.stream().collect(Collectors.groupingBy(Character::getNumericValue));
		
		
		//collect2.entrySet().stream().filter(s->s.getValue()==1).findFirst();
		
		

	}

}
