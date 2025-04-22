public class Inbox {
    private Mail[] mails;
    private int count;

    public Inbox(int size) {
        mails = new Mail[size];
        count = 0;
    }

    public void addMail(Mail mail) {
        if (count < mails.length) {
            mails[count++] = mail;
        } else {
            System.out.println("Inbox is full");
        }
    }

    public void displayMailsHeader() {
        for (int i = 0; i < count; i++) {
            System.out.println(mails[i].getInfoHeader());
        }
    }

    public void open(int index) {
        if (index >= 0 && index < count) {
            System.out.println(mails[index].getInfo());
        } else {
            System.out.println("Invalid index");
        }
    }
    public void countUnread() {
        int unreadCount = 0;
        for (int i = 0; i < count; i++) {
            if (!mails[i].isRead()) {
                unreadCount++;
            }
        }
        System.out.println("Number of unread mails: " + unreadCount);
    }

    public Mail[] getMails() {
        return mails;
    }

    public void setMails(Mail[] mails) {
        this.mails = mails;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
