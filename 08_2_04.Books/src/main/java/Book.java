
public class Book {
	private String Title;
	private int Pages;
	private int PublicationYear;

	public Book(String title, int pages, int publicationYear) {
		this.Title = title;
		this.Pages = pages;
		this.PublicationYear = publicationYear;

	}

	public String getTitle() {
		return Title;
	}

	public int getPage() {
		return Pages;
	}

	public int getPublicationYear() {
		return PublicationYear;
	}

	public String toString() {
		return this.Title + ", " + this.Pages + " pages, " + this.PublicationYear;
	}
}
