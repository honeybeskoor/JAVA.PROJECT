package mylibrary;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<BookItem> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public void addBook(BookItem b) {
        books.add(b);
    }

    public boolean borrowBook(String code) {
        for (BookItem b : books) {
            if (b.getCode().equals(code)) {
                return b.borrowItem();
            }
        }
        return false;
    }

    public boolean returnBook(String code) {
        for (BookItem b : books) {
            if (b.getCode().equals(code)) {
                return b.returnItem();
            }
        }
        return false;
    }

    public boolean isBookAvailable(String code) {
        for (BookItem b : books) {
            if (b.getCode().equals(code)) {
                return b.isAvailable();
            }
        }
        return false;
    }

    public void showAllBooks() {
        for (BookItem b : books) {
            System.out.println(b + (b.isAvailable() ? " -> Available" : " -> Borrowed"));
        }
    }
}
