public class Book {
    private String author;

    private String title;

    private String genre;

    public Book(String author, String title, String genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getBookTitle() {
        return this.title;
    }

    public String getBookGenre() {
        return this.genre;
    }
}
