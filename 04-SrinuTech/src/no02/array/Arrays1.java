package no02.array;

import java.util.Arrays;

public class Arrays1 {
	
	public static void main(String[] args) {
		
		int[] array= {10,20,30,40,50};
		
		//before
		System.out.println(array.length);
		
		
		//now
		long count = Arrays.stream(array).count();
		System.out.println(count);
		
		
	}

}
