public class Book extends Publication {
    private String author;

    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", by " + author;
    }
}
