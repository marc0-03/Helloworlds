import yeee.While;

import javax.swing.*;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String word = pickRandomword();
        String Wrongword = "";
        int k = 0;
        int d = 0;
        String Visibleword = "";

        while (d<word.length()){     //vill kunna få längden på det vallda ordet
            if (word.charAt(d) != ' ') {                 //Vill kunna kolla om karaktären i positionen d
                Visibleword = Visibleword + "_ ";        // är " " och om det är det ha ett mellanrum där
            } else {
                Visibleword = Visibleword + "  ";
            }
            d++;
        }
        JOptionPane.showMessageDialog(null, Visibleword + " " + word); //just checkin
        while (k<10 || !Visibleword.contains("_")){
            k++;
            System.out.println(Visibleword + "the word is" + word); //here we should print the hangman the quessed letters, the Visibleword and it should ask the user for a letter im not sure if i should use a JOptionpane or the console for this
        } //kommer utanför denna när när du har slut på gisnignar eller när du är klar
    }

    private static String pickRandomword() {
        String[] words = {"Jack O Lantern", "Jack O Lantern", "Jack O Lantern", "Jack O Lantern"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];
    }
}
