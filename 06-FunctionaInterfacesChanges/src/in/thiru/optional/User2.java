package in.thiru.optional;

import java.util.Optional;

public class User2 {

	// With Optional object
	public Optional<String> getUserNameById(Integer id) {

		String name = null;
		if (id == 101)
		{
			name = "thiru";
			
		} else if (id == 102) 
		{
			name = "guru";
		} 
		else if (id == 103) 
		{
			name = "chandru";
		} 
		else 
		{
			name= null;
		}
		
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {

		User2 user = new User2();
		Optional<String> name = user.getUserNameById(104);
		System.out.println("name of the student with given id :: " + name.get());

	}

}
