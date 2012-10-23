package Library;

public class Person {

	// fields(instance variables)
	private String name;// name of the book person who borrows book
	private int maximumBooks;// maximum number of books borrowed

	public Person() {
		name = "unknown name";
		maximumBooks = 5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

	// Automated code testing procedure for agile (çevik) software development
	// write the test method/class before writing your actual method or class.
	// Do not be afraid of failure.
	public static void main(String[] args) {

	}

}
