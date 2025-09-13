package mylibrary;

import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        Scanner sc = new Scanner(System.in);

        // Add some default books
        shelf.addBook(new BookItem("Wings of Fire", "A.P.J. Abdul Kalam", "X101"));
        shelf.addBook(new BookItem("Rich Dad Poor Dad", "Robert Kiyosaki", "X102"));
        shelf.addBook(new BookItem("Java for Beginners", "James Gosling", "X103"));

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add new book");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Show all books");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter author: ");
                    String a = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String c = sc.nextLine();
                    shelf.addBook(new BookItem(t, a, c));
                    System.out.println("Book added.");
                    break;
                case 2:
                    System.out.print("Enter ISBN to borrow: ");
                    String code1 = sc.nextLine();
                    if (shelf.borrowBook(code1)) {
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Book not available or already borrowed.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ISBN to return: ");
                    String code2 = sc.nextLine();
                    if (shelf.returnBook(code2)) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Invalid return operation.");
                    }
                    break;
                case 4:
                    shelf.showAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting Library...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
