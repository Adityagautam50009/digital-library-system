package main;

import models.Book;
import models.Availability;
import services.Library;
import java.util.Scanner;

/**
 * The main entry point for the Digital Library System.
 */
public class DigitalLibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nDigital Library System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookID = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability (AVAILABLE/CHECKED_OUT): ");
                    Availability availability = Availability.valueOf(scanner.nextLine().toUpperCase());

                    library.addBook(new Book(bookID, title, author, genre, availability));
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID or Title: ");
                    String query = scanner.nextLine();
                    Book found = library.searchBook(query);
                    System.out.println(found != null ? found : "Book not found.");
                    break;
                case 4:
                    System.out.print("Enter Book ID to update: ");
                    String updateID = scanner.nextLine();
                    System.out.print("Enter new Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Enter new Genre: ");
                    String newGenre = scanner.nextLine();
                    System.out.print("Enter new Availability (AVAILABLE/CHECKED_OUT): ");
                    Availability newAvailability = Availability.valueOf(scanner.nextLine().toUpperCase());

                    library.updateBook(updateID, newTitle, newAuthor, newGenre, newAvailability);
                    break;
                case 5:
                    System.out.print("Enter Book ID to delete: ");
                    String deleteID = scanner.nextLine();
                    library.deleteBook(deleteID, scanner);
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
