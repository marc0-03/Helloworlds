import javax.swing.*;

public class skottår {
    public static void main(String[] args) {
        int Jesus = Integer.parseInt(JOptionPane.showInputDialog("bröv vilket år är det"));
        if (Meth.ärskottår(Jesus)) {
            JOptionPane.showMessageDialog(null, "Är ett skåttår");
        } else {
            JOptionPane.showMessageDialog(null, "Är inte ett skåttår");
        }
    }
}
