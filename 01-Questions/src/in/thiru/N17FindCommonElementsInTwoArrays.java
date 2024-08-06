package in.thiru;

import java.util.Arrays;

/*
Find common elements between two arrays:
 */
public class N17FindCommonElementsInTwoArrays {
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 3, 4, 5, 6 };
   
	          int[] commonElements = Arrays.stream(array1).filter(x->Arrays.stream(array2).anyMatch(y->y==x)).toArray();

		for (int i : commonElements) {
			System.out.println(i);
		}

	}

}
