package Library;

public class Person {

	//fields(instance variables)
	private String name;//name of the book person who borrows book
	private int maximumBooks;//maximum number of books borrowed
	
	public Person(){
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

	public static void main(String[] args) {

	}

}
