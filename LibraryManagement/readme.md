# Online Library Management System

This Java program implements an online library management system with the following features: Book Class, Library Class, Member Class, Guest Member Class, Registered Member Class, and a Main Application.

## Classes

### 1. Book Class

- Attributes:
  - Book ID
  - Title
  - Author
  - Genre
  - Availability status

### 2. Library Class

- Methods:
  - `addBook(Book book)`: Adds a book to the library.
  - `removeBook(Book book)`: Removes a book from the library.
  - `checkAvailability(Book book)`: Checks the availability status of a book.
  - `displayBooks()`: Displays the list of books in the library.

### 3. Member Class

- Attributes:
  - Member ID
  - Name
  - List of borrowed books

### 4. Guest Member Class

- Extends Member Class
- Functionality:
  - Can borrow books without having a formal library membership.

### 5. Registered Member Class

- Extends Member Class
- Functionality:
  - Can borrow books
  - Can renew memberships
  - Can return books

### 6. Main Application

- Demonstrates the functionality of the library management system.
- Creates instances of books, members (both registered and guest), borrows and returns books, and displays the library's status.

## Usage

1. Compile and run the `MainApplication.java` file.
2. Follow the prompts to interact with the library system.

## Example

```java
public class MainApplication {
    public static void main(String[] args) {
        // Create instances of books, members, and demonstrate library functionality
        // ...

        // Example usage:
        // library.addBook(new Book(1, "Book Title", "Author Name", "Genre"));
        // library.displayBooks();
        // member.borrowBook(book);
        // member.returnBook(book);
    }
}
