package no01.first;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class No01RemoveDuplicatesUsingCollectioins {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		List<String> uniqueList = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");

		// method-1
//		for (String li : list) {
//
//			if (!uniqueList.contains(li)) {
//				uniqueList.add(li);
//			}
//
//		}
//
////		System.out.println(uniqueList);

		// method-2
		Set<String> set = new LinkedHashSet<>(list);
		System.out.println(set);
	
		//method-3
		List<String> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		
		//method-4
		Set<String> collect2 = list.stream().collect(Collectors.toSet());
		System.out.println(collect2);

	}

}
