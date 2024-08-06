package no02.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 Max element from the array
 */
public class N11RemoveDuplicatesAndNullValues {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList(null,"thiru",null,"vijay","vijay");
		
		List<String> collect = asList.stream().filter(s->s != null).collect(Collectors.toList());
		System.out.println(collect);
		
		
		Map<String, Long> collect2 = collect.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		List<Entry<String, Long>> list = collect2.entrySet().stream().filter(f->f.getValue()==1).toList();
		
		for (Entry<String, Long> entry : list) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
