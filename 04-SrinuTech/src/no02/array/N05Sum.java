package no02.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class N05Sum {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };
		
		//Normal approach
		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];

		}
		System.out.println(sum);
		
		
		//using stream api
		int sum2 = Arrays.stream(array).sum();
		System.out.println(sum2);
		
		//or
		
		long sum3 = Arrays.stream(array).summaryStatistics().getSum();
		System.out.println(sum3);
		
		
	}

}
