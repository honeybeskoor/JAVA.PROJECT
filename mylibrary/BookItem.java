package mylibrary;

public class BookItem extends LibraryThing {
    public BookItem(String title, String author, String isbn) {
        super(title, author, isbn);
    }

    @Override
    public String toString() {
        return getTitle() + " by " + getCreator() + " (ISBN: " + getCode() + ")";
    }
}
