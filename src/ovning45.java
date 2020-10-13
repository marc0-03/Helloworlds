import javax.swing.*;

public class ovning45 {
        public static void main(String[] args) {
            double minuter = Double.parseDouble(JOptionPane.showInputDialog("Hur långt pågick samtalet \n brrrrrr"));
            double nar = Double.parseDouble(JOptionPane.showInputDialog("när pågick samtalet"));
            double dag = Double.parseDouble(JOptionPane.showInputDialog("vilken dag var samtalet \n1 för måndag, 2 för tisdag osv"));
            double pris;
            if (dag >= 5) {
                pris = minuter*0.55;
                pris = pris + 0.6;
        } else if (nar <= 5 || nar >= 20) {
                pris = minuter*0.55;
                pris = pris + 0.6;
            } else {
                pris = minuter*2.5;
                pris = pris + 0.6;
            }
            JOptionPane.showMessageDialog(null, "du måste betala: " + pris);
        }
    }
