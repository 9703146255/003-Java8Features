package in.thiru.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 Take list of persons and print persons whose age is >= 18 using Lambda Expression
 */
public class PredicateDemo3 {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public PredicateDemo3(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "PredicateDemo3 [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		PredicateDemo3 p1 = new PredicateDemo3("John", 26);
		PredicateDemo3 p2 = new PredicateDemo3("Smith", 16);
		PredicateDemo3 p3 = new PredicateDemo3("Raja", 36);
		PredicateDemo3 p4 = new PredicateDemo3("Rani", 6);

		List<PredicateDemo3> persons = Arrays.asList(p1, p2, p3, p4);

		Predicate<PredicateDemo3> p = i -> i.age > 20;

		for (PredicateDemo3 person : persons) {
			if (p.test(person)) {
				System.out.println(person);
			}
		}

	}

}
