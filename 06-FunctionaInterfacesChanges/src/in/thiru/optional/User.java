package in.thiru.optional;

public class User {

	// Without Optional object
	public String getUserNameById(Integer id) {
		if (id == 101) {
			return "thiru";
		} else if (id == 102) {
			return "guru";
		} else if (id == 103) {
			return "chandru";
		} else {
			return null;
		}
	}

	public static void main(String[] args) {

		User user = new User();
		String name = user.getUserNameById(102);
		System.out.println("name of the student with given id :: " + name);
		System.out.println("the length of the given name is   :: " + name.length());

	}

}
