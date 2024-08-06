package in.thiru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
 11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
 */
public class N11Max3Min3Values {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,20,100,40,50,60,90,70,80);
		List<Integer> min3 = asList.stream().sorted().limit(3).collect(Collectors.toList());
		List<Integer> max3 = asList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(min3);
		System.out.println(max3);
		
		
	}

}
