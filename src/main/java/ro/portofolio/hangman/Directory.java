package ro.portofolio.hangman;

public class Directory {
    public Directory() {
    }

    public static final String[] words = new String[]{"apa", "morcov", "sarmale", "telefon", "fasole", "bujor", "busuioc", "electroliza", "polen", "macaroane"};


    public String getWord(int wordNumber) {
        return words[wordNumber];
    }

    public int getLength() {
        return words.length;
    }
}
