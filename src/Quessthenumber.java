import javax.swing.*;

public class Quessthenumber {
    public static void main(String[] args) {
        int N = (int) ((Math.random()*100)+1);
        int k = 0;
        int F = 0;
        int s = 0;
        String try_again = "";
        String sry = "sorry";
        JOptionPane.showMessageDialog(null, "Welcome to the number game \n the computer has chosen a number between 1-100\ntry to get it in the least amount of tries possible");
        while (k == 0) {
            String S = JOptionPane.showInputDialog(null, "Your guess?");
            s = Integer.parseInt(S);
            if (F == 10) {
                sry = "sorry you shithead";
                try_again = "fucking ";
            }
            if (s>N) {
                JOptionPane.showMessageDialog(null, sry + ", to " + try_again +"high.Try again");
                F++;
            } else if (s<N) {
                JOptionPane.showMessageDialog(null, sry + ", to " + try_again +"low. Try again");
                F++;
            } else {
                F++;
                k = 1;
            }
        }
        JOptionPane.showMessageDialog(null, "congratulations the number was " + N + "\nit took you " + F + " tries");
    }
}
