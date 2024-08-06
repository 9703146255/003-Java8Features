package no02.array;

import java.util.Arrays;

public class Arrays3 {

	public static void main(String[] args) {

		int[] array = { 45, 20, 30, 40, 50 };

		// before==>iterate array
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}

		Arrays.sort(array);
		// now==> iterate array[using streams]
		System.out.println();
		
		Arrays.stream(array).sorted().forEach(s->System.out.println(s));

	}

}
