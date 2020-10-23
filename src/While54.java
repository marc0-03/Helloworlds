import javax.swing.*;

public class While54 {
    public static void main(String[] args) {
        String f = JOptionPane.showInputDialog(null, "nummer");
        int n = Integer.parseInt(f);
        int k= 0;
        int summa = 0;
        for (k=0; k>n; k=k+1)
            summa = summa + k;
        JOptionPane.showMessageDialog(null, "summan blir" + summa);
    }
}
