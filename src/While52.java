import javax.swing.*;

public class While52 {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("n"));
        System.out.println(n);
     double summa = 0;
     double k = 1;
     double o = 1;
     while (n>k) {
         summa = summa+ o / n;
     n--;
     }
     JOptionPane.showMessageDialog(null, "summan blir " + summa);
    }
}
