package in.thiru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class N05SortDecimalReverseOrder {
/*
 sorted(Comparator.reverseOrder()).findFirst()			 	==> 1st MAX
 sorted(Comparator.reverseOrder()).skip(1).findFirst()	 	==> 2nd MAX
 sorted(Comparator.reverseOrder()).skip(2).findFirst()	 	==> 3RD MAX
  sorted(Comparator.reverseOrder()).skip(3).findFirst()	 	==> 4TH MAX

 sorted(Comparator.reverseOrder()).skip(4).findFirst()	 	==> 5TH MAX

 sorted(Comparator.reverseOrder()).skip(5).findFirst()	 	==> 6TH MAX

 sorted(Comparator.reverseOrder()).skip(6).findFirst()	 	==> 7TH MAX
 
 ---------------------------------------------------------------------------
 
 sorted().findFirst()			 	==> 1st MIN
  
 sorted().skip(1).findFirst()	 	==> 2nd MIN
 
 sorted().skip(2).findFirst()	 	==> 3RD MIN
 
 sorted().skip(3).findFirst()	 	==> 4TH MIN

 sorted().skip(4).findFirst()	 	==> 5TH MIN

 sorted().skip(5).findFirst()	 	==> 6TH MIN

 sorted().skip(6).findFirst()	 	==> 7TH MIN

 */
	public static void main(String[] args) {
//		List<Double> asList = Arrays.asList(10.0,25.0,13.0,80.0);
//		
//		//by default ascending order
//		asList.stream().sorted().forEach(s->System.out.println(s));
//		System.out.println();
//		//descending order
//		asList.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
//		
//		//first max value and second max value
//		
//		Optional<Double> findFirst = asList.stream().sorted(Comparator.reverseOrder()).findFirst();
//		if(findFirst.isPresent())
//		{
//			System.out.println("first MAX VALUE :: "+findFirst.get());
//		}
//		
//
//		//second max value
//		Optional<Double> secondMaxVal = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//		if(secondMaxVal.isPresent())
//		{
//			System.out.println("first MAX VALUE :: "+secondMaxVal.get());
//		}
//		
//		
//		//first min value
//
//		Optional<Double> firstMin = asList.stream().sorted().findFirst();
//		if(firstMin.isPresent())
//		{
//			System.out.println("first MAX VALUE :: "+firstMin.get());
//		}
//		
//
//		//second min value
//		Optional<Double> secondMin = asList.stream().sorted().skip(1).findFirst();
//		if(secondMin.isPresent())
//		{
//			System.out.println("first MAX VALUE :: "+secondMin.get());
//		}

		List<Integer> asList = maxPractice1();
		minPractice1(asList);
	}

	private static void minPractice1(List<Integer> asList) {
		// first min value
		
		Optional<Integer> firstMin = asList.stream().sorted().findFirst();
		if (firstMin.isPresent()) {
			Integer integer = firstMin.get();
			System.out.println("firstMin value :: " + integer);
		}

		// second min value
		Optional<Integer> secondMin = asList.stream().sorted().skip(1).findFirst();
		if (secondMin.isPresent()) {
			Integer integer = secondMin.get();
			System.out.println("second min value :: " + integer);
		}

		// third min value
		Optional<Integer> thirdMin = asList.stream().sorted().skip(2).findFirst();
		if (thirdMin.isPresent()) {
			Integer integer = thirdMin.get();
			System.out.println("third min value :: " + integer);
		}
		
		//fourth min value
		Optional<Integer> fourthMin = asList.stream().sorted().skip(3).findFirst();
		if (fourthMin.isPresent()) {
			Integer integer = fourthMin.get();
			System.out.println("fourth min value :: " + integer);
		}
	}

	private static List<Integer> maxPractice1() {
		// ascending order
		List<Integer> asList = Arrays.asList(10, 20, 15, 30, 22);
		
		asList.stream().sorted().forEach(s -> System.out.println("Natural sorting order :: " + s));

		asList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println("Reverse order is :: " + s));

		// first max value
		
		Optional<Integer> findFirst = asList.stream().sorted(Comparator.reverseOrder()).findFirst();
		if (findFirst.isPresent()) {
			Integer integer = findFirst.get();
			System.out.println("first max :: " + integer);
		}

		// second max value
	
		Optional<Integer> secondMax = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if (secondMax.isPresent()) {
			Integer integer = secondMax.get();
			System.out.println("second max :: " + integer);
		}

		// third max value
		
		Optional<Integer> thirdMax = asList.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		if (thirdMax.isPresent()) {
			Integer integer = thirdMax.get();
			System.out.println("third max :: " + integer);
		}
		
		//fourth max value
		Optional<Integer> fourth = asList.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst();
		if (fourth.isPresent()) {
			Integer integer = fourth.get();
			System.out.println("fourth max :: " + integer);
		}
		return asList;
	}

}
