import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guiformexample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIformexample");
        frame.setContentPane(new Guiformexample().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton clearButton;
    private JButton button2;

    public Guiformexample() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
