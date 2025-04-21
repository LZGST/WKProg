public class main {
    public static void main(String[] args) {
        //Aufgabe 1
        /*Textbook t1 = new Textbook("Java Programming", "John Doe", "Computer Science", 2020);
        System.out.println(t1.getInfo());

        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        System.out.println(b1.getInfo());

        Publication p1 = new Publication("To Kill a Mockingbird", 1960);
        System.out.println(p1.getInfo());*/

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
        /*int n = 6;
        int a = 0;
        //1 = 1, 2 = 6, 3 = 21, 4 = 52, 5 = 105, 6 = 186
        for(int i = 1; i < n; i++) {
            int k = 1;
            while (k < i) {
                k++;
            }
            a = a + (2*k);
            a++;
        }
        int b = 1;
        for (int j = 1; j < n; j++) {
            int p = 0;
            for (int l = 1; l < n; l++) {
                p = p + (2*l);
            }
            p = p / 2;
            b = b + (2*p);
        }

        int c = a + b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a+b: " + c);*/

    }
}
