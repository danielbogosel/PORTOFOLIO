package ro.portofolio.hangman;

public class Hangman {
    private final String word;
    private String found;

    public Hangman(String word) {
        this.word = word;
        this.found = generateFoundFormat();
    }

    private String generateFoundFormat() {
        found = "";
        for (int i = 0; i < word.length(); i++) {
            found += "_";
        }
        return found;
    }

    public String getWord() {
        return word;
    }

    public String getFound() {
        return found;
    }

    public boolean finished() {
        if (found.contains("_")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean guess(char c) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                completWithFoundLetter(c);
                return true;
            }

        }
        return false;
    }


    private void completWithFoundLetter(char c) {
        char[] foundArray = new char[found.length()];
        char[] wordArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = word.charAt(i);
            foundArray[i] = found.charAt(i);
            if (wordArray[i] == c) {
                foundArray[i] = c;
            }

        }
        String letteraFound = String.copyValueOf(foundArray);
        this.found = letteraFound;

    }
}
