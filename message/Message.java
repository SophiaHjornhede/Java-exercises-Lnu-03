package message;

/**
 * Assignment-3, exercise-3
 *
 * @author Sophia Hjörnhede
 * @version 1.10 06 July 2020
 */

public class Message {
    String text;

    public Message() {
    }

    public Message(String text) {       //  this method is not in instructions
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public String encode2() {
        String encodedMessage = "";
        char character = 0;
        String messageTextFromObject = this.text;   // reading the text message from the object.
        for (int i = 0; i < this.text.length(); i++) {
            character = messageTextFromObject.charAt(i);
            if ((character > 64 && character < 91) || (character > 96 && character < 123)) { // Make sure only alphabetic ones we change

                character++;    // increase the value of the character
                encodedMessage += character;    // add the character to the return string

                if (character == 'z') {     // if character is end of line, put it as an a
                    character = 'a';
                    encodedMessage += character;     // Adding the a to the string
                }
                if (character == 'Z') {     // if character is end of line, put it as an A
                    character = 'A';
                    encodedMessage += character;    // Adding the A to the string
                }
            } else
                encodedMessage += character; // adding character to string without any change
        }
        return encodedMessage;  // Returning the encoded message
    }
}
