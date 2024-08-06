package in.thiru.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 Predicate Joining[combine multiple predicates] by using or()  , and() methods 
 
 -> To combine multiple predicates we will use Predicate Joining

and ( ) method

or ( ) method

Task-1 : Print "emp names" who are working in "Hyd location" in "DB team."
 */
class Employee {

	private String name;
	private String location;
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", dept=" + dept + "]";
	}

	public Employee(String name, String location, String dept) {

		this.name = name;
		this.location = location;
		this.dept = dept;
	}

}

public class PredicateDemo4 {

	public static void main(String[] args) {

		Employee e1 = new Employee("Anil", "Chennai", "DevOps");
		Employee e2 = new Employee("Rani", "Pune", "Networking");
		Employee e3 = new Employee("Thirumalesh", "Hyd", "DB");
		Employee e4 = new Employee("Ganesh", "Hyd", "DB");

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee> p0 = name -> name.getName().startsWith("T");
		Predicate<Employee> p1 = location -> location.getLocation().equals("Hyd");
		Predicate<Employee> p2 = dept -> dept.getDept().equals("DB");

		Predicate<Employee> p = p0.and(p1).and(p2);

		for (Employee emp : emps) {

			if (p.test(emp)) {
				System.out.println(emp);
			}

		}

	}

}
