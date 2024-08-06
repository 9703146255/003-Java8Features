package no02.array;

import java.util.Arrays;

public class Arrays2 {
	
	public static void main(String[] args) {
		
		
		
		int[] array= {10,20,30,40,50};
		
		
		//before==>iterate array
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		//now==> iterate array[using streams]
		System.out.println();
		Arrays.stream(array).forEach(s->System.out.println(s));
	
	
		
		
	}

}
