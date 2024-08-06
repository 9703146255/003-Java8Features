package no02.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/*
 Max element from the array
 */
public class N10CheckGivenStreamIsParallel {

	public static void main(String[] args) {

		int[] array = { 10, 20, 1, 40, 50 };

		// using stream api
		

		boolean parallel = Arrays.stream(array).isParallel();
		System.out.println(parallel);
		
		boolean parallel2 = Arrays.stream(array).parallel().isParallel();
		System.out.println(parallel2);
		
		
		//interview question
		// string is length < 4 include null value as well and we need to add z at the beginning
		String[] array1= {"thiru","sreenath","abc"," ",null,"bb","cc","dd",null,"f"};
		
	    List<String> collect = Arrays.stream(array1).filter(s->Optional.ofNullable(s).map(x->x.length()<4).orElse(true)).collect(Collectors.toList());
	    System.out.println(collect);
	    
	    //name->Optional.ofNullable(name).map(x->x.length()<4).orElse(true) inside filterm
	    List<String> collect2 = Arrays.stream(array1).filter(name->Optional.ofNullable(name).map(x->x.length()<4).orElse(true)).collect(Collectors.toList());
	    System.out.println(collect2);
	


	}

}
