package no02.array;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class N07EvenFilter {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };

		// using stream api
		Arrays.stream(array).filter(s -> s % 2 == 0).forEach(
				(x) -> 
				{
					System.out.println(x);
				});

		// or
		System.out.println();
		Arrays.stream(array).filter(x->x%2==0).forEach(s->System.out.println(s));


	}

}
