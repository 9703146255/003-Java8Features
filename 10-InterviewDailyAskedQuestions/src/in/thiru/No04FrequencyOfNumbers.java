package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class No04FrequencyOfNumbers {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50, 50, 40, 40);
		Set<Entry<Integer, Long>> entrySet = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
		for (Entry<Integer, Long> entry : entrySet) {
			System.out.println(entry.getKey() + "  :: " + entry.getValue());
		}

	}

}
