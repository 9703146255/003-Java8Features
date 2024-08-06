package in.thiru;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No01DuplicatesNumbersCount {
	
	public static void main(String[] args) {
		practice1();
		 		
		//method 1[using Collectors.groupingBy and Filter]
		 	List<Integer> asList = Arrays.asList(11,22,33,44,55,66,77);
		 	List<Long> collectq =
		 	asList
		 	.stream()
		 	.collect(Collectors.groupingBy(z->z,Collectors.counting()))
		 	.entrySet()
		 	.stream()
		 	.filter(entry->entry.getValue()>1).map(Map.Entry::getValue)
		 	.collect(Collectors.toList());
		 	System.out.println(collectq);
		 	
		 	//method-2 using Collectors.frequency(num,i) in filter and distinct
		 	List<Integer> asList1 = Arrays.asList(11,22,33,44,55,66,77,22,22,33);
		 	List<Integer> collect = asList1
		 	.stream()
		 	.filter(f->Collections.frequency(asList1, f) >1)
		 	.distinct()
		 	.collect(Collectors.toList());
		 	 System.out.println("freq ::");
		 	 System.out.println(collect);
		 	
		 	//method-3 using HashSet
		 	List<Integer> asList2 = Arrays.asList(11,22,33,44,55,66,77,22,22,33);
		 	Set<Integer> set=new HashSet<>();
		 	List<Integer> collect2 = 
		 	asList2
		 	.stream()
		 	.filter(s->!set.add(s))
		 	.distinct()
		 	.collect(Collectors.toList());
		 	System.out.println("hashSet ::");
		 	System.out.println(collect2);
		 	//method-4 using map
		 	
		 	List<Integer> asList3 = 
		 	Arrays.asList(11,22,33,44,55,66,77,22,22,33);
		 	Set<Entry<Integer, Long>> entrySet1 =
		 	asList3
		 	.stream()
		 	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 	.entrySet();
		 	
		 	for(Entry<Integer, Long> entry2 : entrySet1)
		 	{
				System.out.println(entry2.getKey()+" : "+entry2.getValue());
			}
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		

	}

	private static void practice1() {
		//method-1    
		List<Integer> asList = Arrays.asList(10,20,30,40,50,20,10,10);
		List<Integer> collect2 = asList.stream().collect(Collectors.groupingBy(z->z,Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		
		//method-2
		List<Integer> collect = asList.stream().filter(i->Collections.frequency(asList, i)>1)
		.distinct()
		.collect(Collectors.toList());
		System.out.println(collect);
		
		//method-3
		Set<Integer> set=new HashSet<>();
		List<Integer> collect3 = asList.stream().filter(s->!set.add(s))
				.distinct()
				.collect(Collectors.toList());
		System.out.println(collect3);
		
		
		 		List<Integer> collect4 = asList
				.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		 		System.out.println(collect4);
	}
	
	

}
