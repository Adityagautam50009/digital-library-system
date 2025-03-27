package models;

/**
 * Represents a book in the digital library system.
 */
public class Book {
    private String bookID;
    private String title;
    private String author;
    private String genre;
    private Availability availability;

    /**
     * Constructor to initialize a Book object.
     *
     * @param bookID       Unique identifier for the book.
     * @param title        Title of the book.
     * @param author       Author of the book.
     * @param genre        Genre of the book.
     * @param availability Availability status (AVAILABLE / CHECKED_OUT).
     */
    public Book(String bookID, String title, String author, String genre, Availability availability) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    // Getters
    public String getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public Availability getAvailability() { return availability; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setAvailability(Availability availability) { this.availability = availability; }

    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Title: " + title + ", Author: " + author + 
               ", Genre: " + genre + ", Availability: " + availability;
    }
}
