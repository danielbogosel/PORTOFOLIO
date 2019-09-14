package ro.portofolio.hangman;

import java.util.Random;
import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args) throws BadCharacterException {
        Directory directory = new Directory();
        Random random = new Random();
        Hangman hangman = new Hangman(directory.getWord(random.nextInt(directory.getLength())));
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a letter");
            char tryChar = scanner.next().charAt(0);
            if (hangman.guess(tryChar)) {
                System.out.println("Good");
                System.out.println(hangman.getFound());
            } else {
                System.out.println("Wrong letter, try another one");
                System.out.println(hangman.getFound());
            }
        } while (hangman.finished() == false);
        System.out.println("The word was: " + hangman.getWord());


    }
}
