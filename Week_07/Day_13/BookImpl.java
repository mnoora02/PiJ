package Day_13;

public class BookImpl implements Book {
	private String author;
	private String title;

	public BookImpl(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}