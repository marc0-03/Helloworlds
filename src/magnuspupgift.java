import javax.swing.*;

public class magnuspupgift {
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
            int k;
            for (k=1; k<e; k=k+1) {
                summa = n * k;
                System.out.println(n + "*" + k + " = " + summa);
            }
        }
    }
}
