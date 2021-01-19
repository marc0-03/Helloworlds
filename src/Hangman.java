import javax.swing.*;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String word = pickRandomword();
        String  Ourword;
        int k = 0;
        int d = 0;
        int i;
        char ourquess;
        String Visibleword = "";

        while (d<word.length()){     //vill kunna få längden på det vallda ordet
            if (word.charAt(d) != ' ') {                 //Vill kunna kolla om karaktären i positionen d
                Visibleword = Visibleword + "_ ";        // är " " och om det är det ha ett mellanrum där
            } else {
                Visibleword = Visibleword + "  ";
            }
            d++;
        }
        while (k<10 || !Visibleword.contains("_")){
            Ourword = JOptionPane.showInputDialog(null, Visibleword + " " + word); //here we should print the hangman the quessed letters, the Visibleword and it should ask the user for a letter im not sure if i should use a JOptionpane or the console for this
            ourquess = Ourword.charAt(0);
            if (word.contains(Ourword)) {
                for (i=0; i<word.length(); i++) {
                    if (word.charAt(i) == ourquess) {
                        Visibleword.charAt(i*2) = ourquess; //Question, how do i change a character at a certain point in a string
                    }
                }
            } else {
                k++;
            }
        } //kommer utanför denna när när du har slut på gisnignar eller när du är klar
        System.out.println(Visibleword + " the word is " + word);
    }

    private static String pickRandomword() {
        String[] words = {"Jack O Lantern", "Jack O Lantern", "Jack O Lantern", "Jack O Lantern"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];
    }
}
