import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + " | Author: " + author + " | ISBN: " + isbn);
    }
}

class Library {
    List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: '" + book.getTitle() + "' by " + book.getAuthor());
    }

    // Search for a book by title
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Display all books in the library
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("\nThe library is empty!");
            return;
        }

        System.out.println("Total Books: " + books.size());
        for (int i = 0; i < books.size(); i++) {
            System.out.print((i + 1) + ". ");
            books.get(i).displayBook();}
    }

    // Get total number of books
    public int getTotalBooks() {
        return books.size();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Library object
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084"));
        library.addBook(new Book("1984", "George Orwell", "978-0451524935"));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", "978-0141439518"));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "978-0316769174"));

        // Display all books in the library
        library.displayAllBooks();

        
        String searchTitle = "1984";
        Book foundBook = library.searchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
            System.out.println("Author: " + foundBook.getAuthor());
            System.out.println("ISBN: " + foundBook.getIsbn());
        } else {
            System.out.println("Book not found: " + searchTitle);
        }

        System.out.println();

        searchTitle = "The Hobbit";
        foundBook = library.searchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
            System.out.println("Author: " + foundBook.getAuthor());
            System.out.println("ISBN: " + foundBook.getIsbn());
        } else {
            System.out.println("Book not found: '" + searchTitle + "'");
        }


        // Display all books again
        library.displayAllBooks();
    }
}
