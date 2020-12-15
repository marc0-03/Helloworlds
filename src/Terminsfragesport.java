import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;

public class Terminsfragesport {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("fragortilltermin"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] fraga = new String[50];
        int count = 0;
        int i = 0;
        int svar;
        int k = 0;
        int[] b = {3, 4, 2, 1, 4, 2, 3, 3, 1, 4}; //svaren//

        while (in.hasNext()) {
            fraga[count++] = in.nextLine(); //lägger in alla frågorna och "svaren" in en lista//
            //vet inte riktigt hur jag ska göra en textfil till Strings, resten känns rätt//
        }
        JOptionPane.showMessageDialog(null, "Välkomen till Terminsfrågesporten\nSvara 1, 2, 3 eller 4 på frågorna");
        while ( i<10) {
            svar = Integer.parseInt(JOptionPane.showInputDialog(null, "Fråga " + i + ".\n" + fraga[i*5] + "\n1:" + fraga[(i*5)+1] + "\n2:" + fraga[(i*5)+2] + "\n3:" + fraga[(i*5)+3] + "\n4:" + fraga[(i*5)+4]));
            if (svar == b[i]) {
            k++;
            JOptionPane.showMessageDialog(null,"Det var rätt");
            } else {
            JOptionPane.showMessageDialog(null, "Det var fel");
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Du fick " + k + "svar rätt!");
    }
}
