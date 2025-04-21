public class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, String subject, int year) {
        super(title, author, year);
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", subject: " + subject;
    }
}
