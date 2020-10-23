import javax.swing.*;

public class magnusugla {
    public static void main(String[] args) {
        while (true) {
            String S = JOptionPane.showInputDialog(null, "vilken gånger tabel");
            String E = JOptionPane.showInputDialog(null, "upp till?");
            if (S == null || E == null)
                break;
            int summa = 0;
            int n = Integer.parseInt(S);
            int e = Integer.parseInt(E);
            e=e+1;
            int k = 1;
            while (k<e) {
                summa = n * k;
                System.out.println(n + "*" + k + " = " + summa);
                k++;
            }
        }
    }
}
