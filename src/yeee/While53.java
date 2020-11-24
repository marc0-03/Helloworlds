package yeee;

import javax.swing.*;

public class While53 {
    public static void main(String[] args) {
        while (true) {
            String hojd = JOptionPane.showInputDialog("Höjden av bollen när den släpps i cm");
            if (hojd == null)
                break;
            double boll = Double.parseDouble(hojd);
            int studs = 0;
            while (boll>=1) {
                boll = boll*0.7;
                studs++;
            }
            JOptionPane.showMessageDialog(null, "antal studs blir " + studs);
        }
    }
}
