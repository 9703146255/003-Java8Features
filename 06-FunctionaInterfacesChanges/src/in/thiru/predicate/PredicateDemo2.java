package in.thiru.predicate;

import java.util.function.Predicate;

/*
Task: Declare names in an array and print names which are starting with 'A' using lambda expression.

		String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
 */
public class PredicateDemo2 {

	public static void main(String[] args) {

		String[] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Aunny" };

		Predicate<String> p1 = i -> i.startsWith("A");

		for (String name : names) 
		{
                  if(p1.test(name))
                  {
                	  System.out.println(name);
                  }
		

	}}}


