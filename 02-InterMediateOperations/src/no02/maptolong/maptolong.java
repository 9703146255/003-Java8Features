package no02.maptolong;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class maptolong {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
		
		strings.stream().mapToInt(Integer::parseInt).sum(); //or
		IntSummaryStatistics statistics = strings.stream().mapToInt(Integer::parseInt).summaryStatistics();
		
		
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getCount());
		System.out.println(statistics.getMax());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getSum());
	}

}
