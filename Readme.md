# Digital Library System

## Overview
The **Digital Library System** is a simple Java-based console application that allows users to manage a collection of books. The system provides functionalities to **add, view, search, update, and delete books** from the library database.

## Features
- **Add Books**: Store book details including ID, title, author, genre, and availability.
- **View Books**: Display all books available in the library.
- **Search Books**: Find a book using its ID or title.
- **Update Book Details**: Modify existing book information.
- **Delete Books**: Remove books from the library database.

## File Structure
```
DigitalLibrary/
│── src/
│   │── models/
│   │   ├── Book.java
│   │   ├── Availability.java
│   │── services/
│   │   ├── Library.java
│   │── main/
│   │   ├── DigitalLibrarySystem.java
│── README.md
```

## Prerequisites
Before running the application, ensure you have the following installed:
- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- A Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

## Setup Instructions
### 1. Clone the Repository
```sh
git clone https://github.com/Adityagautam50009/digital-library-system.git
cd digital-library-system
```

### 2. Compile the Code
If using the command line:
```sh
javac -d bin src/models/*.java src/services/*.java src/main/*.java
```
If using an IDE:
- Open the project in IntelliJ IDEA or Eclipse.
- Ensure the `src` folder is marked as the source root.
- Click **Run** to compile.

### 3. Run the Application
```sh
java -cp bin main.DigitalLibrarySystem
```
Or, if using an IDE:
- Navigate to `DigitalLibrarySystem.java`
- Click **Run** or press `Shift + F10` (IntelliJ) or `Ctrl + F11` (Eclipse).

## How to Use
1. Run the program and select an option from the menu.
2. Enter book details when prompted.
3. Perform operations like searching, updating, or deleting books.
4. Exit the program by selecting option `6`.

## Future Enhancements
- Implement a file/database storage system for persistent data.
- Add user authentication for role-based access.
- Create a graphical user interface (GUI) using JavaFX or Swing.

## Contributing
If you'd like to contribute, feel free to fork the repository and submit a pull request!

---
**Author**: Aditya Kumar Gautam  
**Contact**: adityagautam50009@gmail.com

