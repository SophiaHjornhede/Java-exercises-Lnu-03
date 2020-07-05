package message;

/**
 * Assignment-3, exercise-3
 *
 * @author Sophia Hjörnhede
 * @version 1.10 30 June 2020
 */

public class Email extends Message{
    String sender;      // Reason for string is can contain characters
    String receiver;   // Reason for string is can contain characters
    String subject;     // Reason for string is can contain characters

    public Email(String text, String sender, String receiver, String subject) {
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return
                "Sender='" + sender + '\'' +
                        ", Receiver='" + receiver + '\'' +
                        ", Subject='" + subject + '\'' +
                        ", Text='" + text + '\'' ;
    }
}