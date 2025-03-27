package services;

import models.Book;
import models.Availability;
import java.util.*;

/**
 * Manages book-related operations such as adding, updating, deleting, and searching books.
 */
public class Library {
    private Map<String, Book> books;

    /**
     * Constructor to initialize the library.
     */
    public Library() {
        books = new HashMap<>();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book The book object to add.
     */
    public void addBook(Book book) {
        if (books.containsKey(book.getBookID())) {
            System.out.println("Book ID must be unique!");
        } else {
            books.put(book.getBookID(), book);
            System.out.println("Book added successfully.");
        }
    }

    /**
     * Displays all books available in the library.
     */
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    /**
     * Searches for a book by ID or Title (case insensitive).
     *
     * @param query The book ID or title to search.
     * @return The book object if found, otherwise null.
     */
    public Book searchBook(String query) {
        String lowerQuery = query.toLowerCase();
        for (Book book : books.values()) {
            if (book.getBookID().equalsIgnoreCase(query) || book.getTitle().toLowerCase().contains(lowerQuery)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Updates an existing book's details.
     *
     * @param bookID       The ID of the book to update.
     * @param title        New title.
     * @param author       New author.
     * @param genre        New genre.
     * @param availability New availability status.
     */
    public void updateBook(String bookID, String title, String author, String genre, Availability availability) {
        Book book = books.get(bookID);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
            book.setGenre(genre);
            book.setAvailability(availability);
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    /**
     * Deletes a book from the library.
     *
     * @param bookID  The ID of the book to delete.
     * @param scanner Scanner to take user confirmation.
     */
    public void deleteBook(String bookID, Scanner scanner) {
        if (books.containsKey(bookID)) {
            System.out.print("Are you sure you want to delete this book? (yes/no): ");
            String confirm = scanner.nextLine().toLowerCase();
            if (confirm.equals("yes")) {
                books.remove(bookID);
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}
