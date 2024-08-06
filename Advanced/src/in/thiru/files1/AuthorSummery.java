package in.thiru.files1;

public class AuthorSummery {
	String author;
	double totalSales;

	public AuthorSummery(String author, double totalSales) {
		super();
		this.author = author;
		this.totalSales = totalSales;
	}

	@Override
	public String toString() {
		return "AuthorSummery [author=" + author + ", totalSales=" + totalSales + "]";
	}

}
