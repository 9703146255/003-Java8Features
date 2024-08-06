package in.thiru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 Find the second largest number in an integer array:
 */
public class N14FindSecondLargestIntgerInArray {
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,20,50,60,80,1,15,80);
		Integer orElse = asList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
		System.out.println(orElse);
		
	}

}
