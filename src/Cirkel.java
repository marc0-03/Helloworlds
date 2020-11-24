import javax.swing.*;

public class Cirkel {
    public static void main(String[] args) {
        Double s = Double.parseDouble(JOptionPane.showInputDialog(null, "radien på cirkeln"));
        Double x = Meth.CirkelArea(s);
        Double y = Meth.CirkelOmkrets(s);
        JOptionPane.showMessageDialog(null, "Arean på cirkeln är " + x + "}\nOmkretsen på cirkeln är " + y);
    }
}
