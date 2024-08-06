package no01.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
	public static void main(String[] args) {
		
		
		List<String> asList = Arrays.asList("aaaa", null, "bbbbbbbbbb");
		
		System.out.println(asList.stream().filter(s -> s!=null && s.length()>=4).map(s->"z"+s).collect(Collectors.toList()));
		
		System.out.println(Stream.of(1,2,3,4).sorted((a,b)->(a<b)?1:(a>b)?-1:+1).findFirst().get());
	}

}
