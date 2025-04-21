public class main {
    public static void main(String[] args) {
        //Aufgabe 1
        Textbook t1 = new Textbook("Java Programming", "John Doe", "Computer Science", 2020);
        System.out.println(t1.getInfo());

        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        System.out.println(b1.getInfo());

        Publication p1 = new Publication("To Kill a Mockingbird", 1960);
        System.out.println(p1.getInfo());

        //Aufgabe 3
        Inbox inbox = new Inbox(5);
        Mail mail1 = new Mail("Meeting Reminder", "Don't forget the meeting at 10 AM", "Don't forget the meeting at 10 AM");
        Mail mail2 = new Mail("Project Update", "The project is on track", "The project is on track");
        Mail mail3 = new Mail("Lunch Plans", "Let's have lunch at 1 PM", "Let's have lunch at 1 PM");

        inbox.addMail(mail1);
        inbox.addMail(mail2);
        inbox.addMail(mail3);
        mail1.setRead(true);
        inbox.countUnread();
        inbox.displayMailsHeader();
    }
}
