import java.util.Date;

public class Mail {
    private String sender;
    private String subject;
    private String message;
    private String date;
    private boolean isRead;

    public Mail(String sender, String subject, String message) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.date = new Date().toString();
        this.isRead = false;
    }

    public String getInfoHeader() {
        return "isRead: " + isRead + ", sender: " + sender + ", subject: " + subject + ", date: " + date;
    }

    public String getInfo() {
        return "isRead: " + isRead + ", sender: " + sender + ", subject: " + subject + ", message: " + message + ", date: " + date;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
