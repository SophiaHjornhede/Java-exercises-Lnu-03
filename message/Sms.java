package message;

/**
 * Assignment-3, exercise-3
 *
 * @author Sophia Hjörnhede
 * @version 1.10 30 June 2020
 */

public class Sms extends Message{
    String recipientContactNo; // Reason for String its very flexible

    public Sms(String text, String recipientContactNo) {
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    public String getRecipientContactNo() {
        return recipientContactNo;
    }

    public void setRecipientContactNo(String recipientContactNo) {
        this.recipientContactNo = recipientContactNo;
    }

    @Override
    public String toString() {
        return recipientContactNo + " "+ text;
    }
}