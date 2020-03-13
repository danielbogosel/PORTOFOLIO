package ro.portofolio.hangman;

public class BadCharacterException extends Exception {
    public BadCharacterException(){
        super("You ENTER an invalid character");
    }
}
