import javax.swing.*;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) { //tja
        String word = pickRandomword();
        String  Ourword;
        int k = 0;
        int d = 0;
        int Tries = 0;
        char ourquess;
        String Visibleword = "";
        String felgisning = "";
        String[] gubben = {" ------\n" +
                "|     |\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|     +\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|    -+\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|    -+-\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|   /-+-\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|   /-+-/\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|   /-+-/\n" +
                "|     |\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|   /-+-/\n" +
                "|     |\n" +
                "|     |\n" +
                "|\n" +
                "|\n" +
                "----------"," ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|   /-+-/\n" +
                "|     |\n" +
                "|     |\n" +
                "|    |\n" +
                "|    |\n" +
                "----------", " ------\n" +
                "|     |\n" +
                "|     0\n" +
                "|   /-+-/\n" +
                "|     |\n" +
                "|     |\n" +
                "|    | |\n" +
                "|    | |\n" +
                "----------"};
        while (d<word.length()){     //vill kunna få längden på det vallda ordet
            if (word.charAt(d) != ' ') {                 //Vill kunna kolla om karaktären i positionen d
                Visibleword = Visibleword + "_ ";        // är " " och om det är det ha ett mellanrum där
            } else {
                Visibleword = Visibleword + "  ";
            }
            d++;
        }
        while (k<10 && Visibleword.contains("_")){
            Ourword = JOptionPane.showInputDialog(null, gubben[k] + "\nBokstäver du har gissat: " + felgisning + "\n" + Visibleword); //here we should print the hangman the quessed letters, the Visibleword and it should ask the user for a letter im not sure if i should use a JOptionpane or the console for this
            Ourword = Ourword.toUpperCase();
            ourquess = Ourword.charAt(0);
            if (! felgisning.contains(Ourword)) {
                felgisning = felgisning + ourquess + ",";
                Tries++;
                if (word.contains(Ourword)) {
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == ourquess) {
                            Visibleword = Visibleword.substring(0, i * 2) + word.charAt(i) + Visibleword.substring((i * 2) + 1);
                        }
                    }
                } else {
                    k++; //fick ett fel.
                }
            } else {
                JOptionPane.showMessageDialog(null, "Du har redan gissat " + Ourword);
            }
        } //kommer utanför denna när när du har slut på gisnignar eller när du är klar
        if (k<10) {
            JOptionPane.showMessageDialog(null,  gubben[k] + "\n\nDu vann! \nOrdet var " + word + "\nDet tog " + Tries + " försök att få ordet");
        } else { //om du van ser du medelandet över och om du förlorade ser du det som är under
            JOptionPane.showMessageDialog(null,  gubben[k] + "\n\nFan han dog! \nDet här är ditt fel, ordet var " + word + " det borde inte varit så svårt\nDet tog dig " + Tries + " försök Men endå kunde du inte rädda han");
        }
    }

    private static String pickRandomword() {
        String[] words = {"JACK O LANTERN", "DANDARA", "UNDERTALE", "JACK THE RIPPER", "NEW PHONE WHO DIS", "PIE", "DEAD MEN TELL NO TALES", "MONKEY VS LIZARD"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];
    }
}
