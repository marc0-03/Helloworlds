import javax.swing.*;

public class miles {
    public static void main(String[] args) {
        int N = 0;
        int k = 0;
        int T = 0;
        int t = 0;
        int S = 0;
        int Z = 0;
        int x = 0;
        int i = 0;
        String o;
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "how many times did you switch speed"));
        while (N > k) {
            o = (JOptionPane.showInputDialog(null, "time"));
            i = o.indexOf(' ');
            t = Integer.parseInt(o.substring(0, i));
            S = Integer.parseInt(o.substring(i, i+1));
            x = t-T;
            Z = x*S+Z;
            T = t;
            k = k+1;
        }
        JOptionPane.showMessageDialog(null, Z + " Miles" + i);

    }
}