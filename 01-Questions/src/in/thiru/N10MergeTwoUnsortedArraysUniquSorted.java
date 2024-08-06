package in.thiru;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 Merge two unsorted arrays into a single sorted array without duplicates:
 */
public class N10MergeTwoUnsortedArraysUniquSorted {

	public static void main(String[] args) {

		int[] array1 = { 10, 20, 30 };
		int[] array2 = { 40, 50, 30 };

		int[] array = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().sorted().toArray();
		
		for (int i : array) {
			System.out.println(i);
		}

	}

}
