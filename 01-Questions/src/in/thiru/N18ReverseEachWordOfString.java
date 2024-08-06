package in.thiru;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 Reverse each word of a string using Java 8 streams:
 */
public class N18ReverseEachWordOfString {
	
	public static void main(String[] args) {
		String sentence = "Hello World";
		
		//method-1
		String string = Arrays.stream(sentence.split(" ")).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" ")).toString();
		
		//method-2
		String string2 = Arrays.stream(sentence.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" ")).toString();
		System.out.println(string);
		System.out.println(string2);
	}

}
