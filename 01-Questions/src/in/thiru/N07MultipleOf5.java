package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  7) From the given list of integers, print the numbers which are multiples of 5?
 */
public class N07MultipleOf5 {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,20,30,40,50,22,56,98);
		List<Integer> collect = asList.stream().filter(s->s%5==0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
