import java.util.ArrayList;

public class Library {


    private int capacity;
    private ArrayList<Book> stock;

    public Library(ArrayList<Book> stock, Integer capacity) {  //Need to pass the ArrayList in here?
        this.stock = stock;
        this.capacity = capacity;
    }

    public int getStockLevel() {
        return stock.size();
    }

    public void addBook(Book book) {
        stock.add(book);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean addBookIfSpaceAvailable(Book book) {
        if (stock.size() < capacity) {
            stock.add(book);
            return true;
        } else {
            return false;
        }
    }

    public Book removeBook() {
        Book bookToRemove = this.stock.remove(0);
        return bookToRemove;
    }
}

