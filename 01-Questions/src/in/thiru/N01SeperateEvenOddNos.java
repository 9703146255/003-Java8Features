package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 1) Given a list of integers, separate odd and even numbers?
 */
public class N01SeperateEvenOddNos {

	public static void seperateOddAndEven() {

		//Approach-1
		System.out.println("==================::Approach-1::==================");
		List<Integer> asList = Arrays.asList(12, 13, 15, 17, 22);
		Map<Boolean, List<Integer>> map = asList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(map.get(true));  //get(key)
		System.out.println(map.get(false)); //get(key)
		
		
		//Approach-2
		System.out.println("==================::Approach-2::==================");
		List<Integer> collect2 = asList.stream().filter(n->n%2==0).collect(Collectors.toList()); System.out.println(collect2);
		List<Integer> collect3 = asList.stream().filter(n->n%2==1).collect(Collectors.toList()); System.out.println(collect3);

	}

	public static void main(String[] args) {

//		List<Integer> asList = Arrays.asList(10,2,5,8,9,11);
//		//method-1
//		Map<Boolean, List<Integer>> collect = asList.stream().collect(Collectors.partitioningBy(n->n%2==0));
//		System.out.println(collect.get(true));
//		System.out.println(collect.get(false));
//		
//		//method-2
//		
//		List<Integer> even = asList.stream().filter(s->s%2==0).collect(Collectors.toList());
//		List<Integer> odd = asList.stream().filter(s->s%2==1).collect(Collectors.toList());
//		System.out.println(even);
//		System.out.println(odd);

//		List<Integer> asList = Arrays.asList(10, 20, 30, 50, 1, 23, 45);
//		System.out.println(asList);
//
//		Map<Boolean, List<Integer>> collect = asList.stream().collect(Collectors.partitioningBy(s -> s % 2 == 0));
//		System.out.println(collect.get(true));
//		System.out.print,n(collect.get(false));
//
//		List<Integer> collect2 = asList.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
//		List<Integer> collect3 = asList.stream().filter(s -> s % 2 == 1).collect(Collectors.toList());
//
//		System.out.println("even numbers are ::" + collect2);
//		System.out.println("odd numbers are ::" + collect3);

		seperateOddAndEven();

	}

}
