package no02.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;

public class N06Averages {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };
		
		//Normal approach
		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];

		}
		System.out.println(sum/array.length);
		
		
		//using stream api
		 OptionalDouble average = Arrays.stream(array).average();
		 System.out.println(average.getAsDouble());
		
		
		//or
		
		 double average2 = Arrays.stream(array).summaryStatistics().getAverage();
		System.out.println(average2);
		
		
	}

}
