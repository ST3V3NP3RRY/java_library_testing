import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
   private Library library;

   @Before
    public void before() {

       Book book = new Book("Clean Code", "Robert Martin", "Software Development");
       Book book1 = new Book("Stephen King", "Misery", "Horror");
       Book book2 = new Book("Game of Thrones", "George RR Martin", "Fantasy");
       Book book3 = new Book("Start with Why", "Simon Sinek", "Business");

       ArrayList<Book> books = new ArrayList<>();
       books.add(book);
       books.add(book1);
       books.add(book2);
       books.add(book3);

       library = new Library(books, 5);

   }

   @Test
    public void stockCountStartsAt0() {
       assertEquals(4, library.getStockLevel());
   }

   @Test
    public void addBookToStock() {
       Book book = new Book("Stephen King", "IT", "Horror");
       library.addBook(book);
       assertEquals(5, library.getStockLevel());
   }

   @Test
   public void getLibraryCapacity() {
      assertEquals(5, library.getCapacity());
   }

   @Test
   public void addBookIfSpaceAvailable_true() {
       Book book3 = new Book("Start with Why", "Simon Sinek", "Business");
       assertEquals(true, library.addBookIfSpaceAvailable(book3));
       assertEquals( 5, library.getStockLevel());
   }

   @Test
    public void  addBookIfSpaceAvailable_false() {
       Book book5 = new Book("Stephen King", "Misery", "Horror");
       library.addBook(book5);
       Book book6 = new Book("JK Rowling", "Harry Potter", "Fantasy" );
       assertEquals(false, library.addBookIfSpaceAvailable(book6));
       assertEquals( 5, library.getStockLevel());
   }

   @Test
    public void canRemoveBookFromStock() {
      library.removeBook();
      assertEquals(3, library.getStockLevel());
   }




}
