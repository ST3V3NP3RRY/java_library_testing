import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;

    @Before
    public void before() {
        borrower = new Borrower();
    }

    @Test
    public void collectionStartsAt0() {
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection(){
        Book book = new Book("Frank Herbert", "Dune", "Sci-fi");
        assertEquals(1, borrower.addBookToCollection(book));
    }

    @Test
    public void canGetBookFromLibrary(){
        Book book = new Book("Frank Herbert", "Dune", "Sci-fi"); //make a new book object
        ArrayList<Book> LibraryBooks = new ArrayList<>(); //Create a new empty ArrayList
        LibraryBooks.add(book); // add the book to library books
        Library library = new Library(LibraryBooks, 5); //Make a new library object
        borrower.getBookFromLibrary(library); //pass the library object to getBooksFromLibrary
        assertEquals(1, borrower.collectionCount()); // book added to borrowers collection
    }
}
