import javax.swing.*;

public class yeas {
        public static void main(String[] args) {
    double bredd = Double.parseDouble(JOptionPane.showInputDialog("Hur bredd är den?"));
    double langd = Double.parseDouble(JOptionPane.showInputDialog("Vilken längd har den?"));
    double tjocklek = Double.parseDouble(JOptionPane.showInputDialog("hur tjock är den?"));
    String langdse;
    String breddse;
    String tjocklekse;
    String lbtse;
    if (langd>140 && langd<600) {
        langdse ="Okej";
    } else {
        langdse ="Inte okej";
    }
    if (bredd<90) {
        breddse ="Okej";
    } else {
        breddse ="Inte okej";
    }
    if (tjocklek>100) {
        tjocklekse ="Okej";
    } else {
        tjocklekse ="Inte okej";
    }
    double lbt = langd+bredd+tjocklek;
    if (lbt>900) {
        lbtse ="Okej";
    } else {
        lbtse ="Inte okej";
    }
    JOptionPane.showMessageDialog(null, "längden är: " + langdse + "\nBredden är:" + breddse + "\nTjockleken är:" + tjocklekse + "\nLBT är:" + lbtse);
        }
    }
