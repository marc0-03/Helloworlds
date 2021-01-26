import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String word = pickRandomword();
        String  Ourword;
        int k = 0;
        int d = 0;
        char ourquess;
        String Visibleword = "";
        String[] gubben = {"Frame1","Frame2","Frame3","Frame4","Frame5","Frame6","Frame7","Frame8","Frame9","Frame10"};
        String felgisning = "";

        while (d<word.length()){     //vill kunna få längden på det vallda ordet
            if (word.charAt(d) != ' ') {                 //Vill kunna kolla om karaktären i positionen d
                Visibleword = Visibleword + "_ ";        // är " " och om det är det ha ett mellanrum där
            } else {
                Visibleword = Visibleword + "  ";
            }
            d++;
        }
        while (k<10 && Visibleword.contains("_")){
            Ourword = JOptionPane.showInputDialog(null, gubben[k] + "\nDina Bokstäver du har gissat: " + felgisning + "\n" + Visibleword + " " + word); //here we should print the hangman the quessed letters, the Visibleword and it should ask the user for a letter im not sure if i should use a JOptionpane or the console for this
            ourquess = Ourword.charAt(0);
            if (! felgisning.contains(Ourword)) {
                if (word.contains(Ourword)) {
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == ourquess) {
                            Visibleword = Visibleword.substring(0, i * 2) + word.charAt(i) + Visibleword.substring((i * 2) + 1);
                        }
                    }
                } else {
                    k++; //fick ett fel, borde också lägga till den gissade bokstaven till en lista
                    felgisning = felgisning + ourquess + ",";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Du har redan gissat " + Ourword);
            }
        } //kommer utanför denna när när du har slut på gisnignar eller när du är klar
        JOptionPane.showMessageDialog(null, "yooo");
    }

    private static String pickRandomword() {
        String[] words = {"Jack O Lantern", "Jack O Lantern", "Jack O Lantern", "Jack O Lantern"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];
    }
}
