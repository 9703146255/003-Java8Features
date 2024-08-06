package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class N04FreqOfEachElementInArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,20,30,40,80,10);
		Map<Integer, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
	}

}
