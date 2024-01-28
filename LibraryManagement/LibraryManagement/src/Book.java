
public class Book {
int bookId;
String title;
String author;
String genre;
Boolean available;

public Book(int bookId, String title, String author, String genre, boolean available) {
    this.bookId = bookId;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.available = available;
}

public String getTitle() {
    return title;
}

}
