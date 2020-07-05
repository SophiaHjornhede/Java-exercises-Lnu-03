package message;

/**
 * Assignment-3, exercise-3, main class
 *
 * @author Sophia Hjörnhede
 * @version 1.10 30 June 2020
 */

public class MessagingMain {


    public static void main(String[] args) {
        char a = 'a';     // Delete
        char A = 'A';
        char Z = 'Z';
        char z = 'z';
        char blank = ' ';

        Message message1 = new Message("Hello this is a message");
        Sms sms1 = new Sms("This is Java!", "3-12-3");
        Email email1 = new Email("Email contents", "JamesDean@gmail.com", "BruceLee@gmail.com", "Wazzuo!");

        System.out.println(message1.toString());
        System.out.println(sms1.toString());
        System.out.println(email1.toString());
        message1.setText("New Text");
        sms1.setRecipientContactNo("New 122-12-12-12-12");
        email1.setSender("New sender");
        email1.setSubject("New subject");
        email1.setReceiver("New receiver");

        System.out.println(message1.toString());
        System.out.println(sms1.toString());
        System.out.println(email1.toString());
        // Encoded
        System.out.println(sms1.encode2());
    }


}
