package in.thiru;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class N16SumOfArray {
	
	public static void main(String[] args) {
		
		
	int[] array= {40,50,60,70};
		
		IntSummaryStatistics statistic = Arrays.stream(array).summaryStatistics();
		System.out.println(statistic.getSum());
		System.out.println(statistic.getAverage());
		System.out.println(statistic.getMax());
		System.out.println(statistic.getMin());
		System.out.println(statistic.getCount());
	}

}
