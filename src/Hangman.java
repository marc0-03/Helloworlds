import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String word = pickRandomword();

    }

    private static String pickRandomword() {
        String[] words = {"ett", "två", "Tre"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];
    }
}
