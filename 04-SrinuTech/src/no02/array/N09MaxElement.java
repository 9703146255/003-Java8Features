package no02.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/*
 Max element from the array
 */
public class N09MaxElement {

	public static void main(String[] args) {

		int[] array = { 10, 20, 1, 40, 50 };

		// using stream api
		

		int asInt = Arrays.stream(array).max().getAsInt();
		System.out.println(asInt);


	}

}
