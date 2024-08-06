package in.thiru.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/*
  Consumer will accept input but it won't return anything ##########
 */
public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> con = (name) -> System.out.println(name + " :: hello guys how are you!");

		con.accept("Ashok");
		con.accept("John");
		con.accept("Rani");

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

		numbers.forEach(i -> System.out.println(i));

	}

}
