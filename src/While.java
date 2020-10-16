import javax.swing.*;

public class While {
    public static void main(String[] args) {
        String losenordet = "abc123";
        int tries = 0;
        String bla = "fem";
        while (!bla.equals(losenordet)) {
            tries = tries + 1;
            if (tries >=4) {
             System.exit(0);
            }
            bla = JOptionPane.showInputDialog("Lösenordet?");
        }
        JOptionPane.showMessageDialog(null, "rätt lösenord");
    }
}
