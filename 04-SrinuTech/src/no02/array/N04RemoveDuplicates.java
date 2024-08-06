package no02.array;

import java.util.Arrays;

public class N04RemoveDuplicates {
	
	public static void main(String[] args) {
		
		
		int[] array= {30,40,50,70,70};		
		
		Arrays.stream(array).distinct().forEach(s->System.out.println(s));
		
		Arrays.stream(array).distinct().sorted().forEach(s->System.out.println(s));
	}

}
