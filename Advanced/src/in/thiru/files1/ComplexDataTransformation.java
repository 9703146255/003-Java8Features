package in.thiru.files1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComplexDataTransformation {
	/*
	//	        List<AuthorSummery> authorSummaries = books.stream()
//	            .collect(Collectors.groupingBy(Book::getAuthor,
//	                    Collectors.summingDouble(Book::getPrice)))
//	            .entrySet()
//	            .stream()
//	            .map(e -> new AuthorSummary(e.getKey(), e.getValue()))
//	            .collect(Collectors.toList());
	 */
	 public static void main(String[] args) {
	        List<Book> books = Arrays.asList(
	            new Book("Book A", "Author X", 29.99),
	            new Book("Book B", "Author Y", 19.99),
	            new Book("Book C", "Author X", 39.99),
	            new Book("Book D", "Author Z", 49.99),
	            new Book("Book E", "Author Y", 24.99)
	        );


	        
//	        books
//	        .stream()
//	        .collect(Collectors.groupingBy(Book::getAuthor,Collectors.summarizingDouble(Book::getPrice)))
//	        .entrySet().stream().map(e -> new AuthorSummary(e.getKey(), e.getValue()))
//            .collect(Collectors.toList());
//	        
//
//	        authorSummaries.forEach(System.out::println);
	    }

}
