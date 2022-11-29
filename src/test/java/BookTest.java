import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("JRR Tolkien", "Lord of the Rings", "Fantasy");
    }

    @Test
    public void testBookHasAuthor() {
        assertEquals("JRR Tolkien", book.getAuthor());
    }

    @Test
    public void testBookHasTitle() {
        assertEquals("Lord of the Rings", book.getBookTitle());
    }

    @Test
    public void testBookHasGenre() {
        assertEquals("Fantasy", book.getBookGenre());
    }


}
