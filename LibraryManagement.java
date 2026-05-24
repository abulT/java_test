import java.util.*;

class Library {
    private int bookID;
    private String bookName;
    private String author;
    private ArrayList<String> books = new ArrayList<>();

    Library() {
        // default constructor
    }

    Library(int bookID, String bookName, String author) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
    }

    boolean bookAvailable(String enteredBook) {
        return books.contains(enteredBook);
    }

    void addBook(String newBook) {
        books.add(newBook);
        System.out.println(newBook + " added to library");
    }

    void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library");
        } else {
            System.out.println("Books in library:");
            for (String b : books) {
                System.out.println("- " + b);
            }
        }
    }

    void searchBook(String type) {
        boolean found = false;
        for (String b : books) {
            if (b.equalsIgnoreCase(type)) {
                System.out.println(type + " is available");
                found = true;
            }
        }
        if (!found) {
            System.out.println(type + " not available");
        }
    }

    void borrowBook(String book) {
        if (books.remove(book)) {
            System.out.println("Book borrowed successfully: " + book);
        } else {
            System.out.println("Book not found: " + book);
        }
    }

    void returnBook(String book) {
        books.add(book);
        System.out.println("Book returned successfully: " + book);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1: Add Book");
            System.out.println("2: Borrow Book");
            System.out.println("3: Search Book");
            System.out.println("4: List All Books");
            System.out.println("5: Return Book");
            System.out.println("6: Exit");

            int choice = sc.nextInt();
            sc.nextLine();  // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name to add: ");
                    String bookToAdd = sc.nextLine();
                    library.addBook(bookToAdd);
                    break;

                case 2:
                    System.out.print("Enter book name to borrow: ");
                    String borrowBook = sc.nextLine();
                    library.borrowBook(borrowBook);
                    break;

                case 3:
                    System.out.print("Enter book name to search: ");
                    String searchBook = sc.nextLine();
                    library.searchBook(searchBook);
                    break;

                case 4:
                    library.listBooks();
                    break;

                case 5:
                    System.out.print("Enter book name to return: ");
                    String returnBook = sc.nextLine();
                    library.returnBook(returnBook);
                    break;

                case 6:
                    System.out.println("Exiting system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
