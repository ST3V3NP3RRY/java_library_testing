import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int addBookToCollection(Book book){
        collection.add(book);
        return collection.size();
    }

    public void getBookFromLibrary(Library library){
        Book bookFromLibrary = library.removeBook();
        addBookToCollection(bookFromLibrary);
    }


    public int collectionCount() {
        return collection.size();
    }
}
