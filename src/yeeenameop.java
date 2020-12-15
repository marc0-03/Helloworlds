import javax.swing.*;

public class yeeenameop {
    public static void main(String[] args) {
        int s = 0;
        while (true) {
        s = JOptionPane.showConfirmDialog(null, "wanna see name and op?");
            if (s == 0) {
                JOptionPane.showMessageDialog(null, Meth.visainfo());
                break;
            }
        }
    }
}
