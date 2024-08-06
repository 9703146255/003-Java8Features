package in.thiru.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> i > 10;

		System.out.println(p.test(20));
		System.out.println(p.test(1));

	}

}
