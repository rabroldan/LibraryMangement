# Library Management System

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

## Additional Functionality

### Borrowing and Returning Books

- The program allows registered members to borrow books, renew memberships, and return books.
- Example:
  ```java
  RegisteredMember member = new RegisteredMember(101, "John Doe");
  Book book = new Book(1, "Introduction to Java", "Jane Author", "Programming");
  member.borrowBook(book);
  member.returnBook(book);
  ```

### Guest Members

- Guest members can borrow books without a formal library membership.
- Example:
  ```java
  GuestMember guest = new GuestMember(201, "Guest User");
  Book book = new Book(2, "Data Structures", "Bob Writer", "Computer Science");
  guest.borrowBook(book);
  ```

### Displaying Library Status

- The `displayBooks()` method in the Library class allows users to see the current list of books in the library.
- Example:
  ```java
  Library library = new Library();
  library.addBook(new Book(3, "Artificial Intelligence", "Alice Author", "AI"));
  library.addBook(new Book(4, "Web Development Basics", "Charlie Coder", "Web Development"));
  library.displayBooks();
  ```

## Usage

1. Compile and run the `MainApplication.java` file.
2. Follow the prompts to interact with the library system.
