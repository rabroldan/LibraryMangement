
import java.util.ArrayList;
import java.util.List;

public class Library {
	/*
	 * Library Class: Create a Library class that can manage a collection of books.
	 * Implement methods to add books to the library, remove books, check the
	 * availability of a book, and display the list of books
	 */

	List<Book> bookList;

	public Library() {
		this.bookList = new ArrayList<>();
	}

	public void addBook(Book newbook) { // add book

		bookList.add(newbook);
	}

	public void removeBook(String oldbook) {
		List<Book> updatedBookList = new ArrayList<>();

		for (Book book : bookList) {
			if (!book.getTitle().equals(oldbook)) {
				updatedBookList.add(book);
			}
		}

		bookList = updatedBookList;
	}

	public boolean availability(String title) { // check availability
		for (Book book : bookList) {
			if (book.title.equals(title)) {
				return book.available;
			}
		}

		return false;
	}

	public void unavailable(String title) {
		for (Book book : bookList) {
			if (book.title.equals(title)) {
				book.available = false;
			}
		}

	}

	public void burrowingBook(String title) {
		for (Book book : bookList) {
			if (book.title.equals(title)) {
				book.available = false;
			}
		}

	}

	public void returningBook(String title) {
		for (Book book : bookList) {
			if (book.title.equals(title)) {
				book.available = true;
			}
		}

	}

	public List<String> displayAll() {
		List<String> titles = new ArrayList<>();
		for (Book book : bookList) {
			titles.add(book.getTitle());
		}
		return titles;
	}

	public void createBookList() {
		addBook(new Book(1, "Eragon", "Christopher Paolini", "Fantasy", true));
		addBook(new Book(2, "Eldest", "Christopher Paolini", "Fantasy", true));
		addBook(new Book(3, "The Shining", "Stephen King", "Horror", true));
		addBook(new Book(4, "It", "Stephen King", "Horror", true));
		addBook(new Book(5, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", true));
		addBook(new Book(6, "Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Fantasy", true));
	}
}
