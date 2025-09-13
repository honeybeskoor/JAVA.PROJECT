package mylibrary;

public class LibraryThing implements Borrowable {
	private String title;
    private String creator;
    private String code;
    private boolean borrowed;

    public LibraryThing(String title, String creator, String code) {
        this.title = title;
        this.creator = creator;
        this.code = code;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public String getCode() {
        return code;
    }

    // default borrow logic
    @Override
    public boolean borrowItem() {
        if (!borrowed) {
            borrowed = true;
            return true;
        }
        return false;
    }

    // default return logic
    @Override
    public boolean returnItem() {
        if (borrowed) {
            borrowed = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isAvailable() {
        return !borrowed;
    }
}

