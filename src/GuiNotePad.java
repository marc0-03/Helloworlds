import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

public class GuiNotePad {
    JMenuBar menuBar;
    String filnamn = "";

    public GuiNotePad() {

        //Where the GUI is created:
        JMenu menu;
        JMenuItem menuItem;

//Create the menu bar.
        menuBar = new JMenuBar();

//Build the first menu.
        menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

//a group of JMenuItems
        menuItem = new JMenuItem("New", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Open", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Save", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Save as", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);

        //Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);

        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  //Create a new file and if a file is open and has been changed, prompt user to save
                if (!textArea1.getText().equals(filnamn)) {
                    JOptionPane.showMessageDialog(null, "You have unsaved text");
                }
                textArea1.setText("");
            }
        });
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //Open a file in your computor in the text editor
                JFileChooser fc = new JFileChooser();
                int resultat = fc.showOpenDialog(null);
                if (resultat != JFileChooser.APPROVE_OPTION) {
                    System.out.println("ingen fil valdes");
                    System.exit(0);
                }
                filnamn = fc.getSelectedFile().getAbsolutePath();
                FileReader fr = null;
                try {
                    fr = new FileReader(filnamn);
                } catch (FileNotFoundException E) {
                    E.printStackTrace();
                }
                assert fr != null;
                BufferedReader inFile = new BufferedReader(fr);

                String line;
                textArea1.setText("");
                try {
                    while ((line = inFile.readLine()) != null) {
                        textArea1.append(line + "\n");
                    }
                    inFile.close();
                } catch (IOException E) {
                    E.printStackTrace();
                }
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //save the dokument or maybe "save as"? dont really know yet
                if (! filnamn.equals("")) {
                FileWriter fw = null;
                try {
                    fw = new FileWriter(filnamn);
                } catch (IOException g) {
                    g.printStackTrace();
                }
                assert fw != null;
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter outFile = new PrintWriter(bw);

                outFile.println(textArea1.getText());
                    outFile.flush();
                    outFile.close();
            } else {
                    JOptionPane.showMessageDialog(null, "Ingen fil är vald\nKan inte spara");
                }
            }
        });
        saveAsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int result = fc.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    filnamn = fc.getSelectedFile().getAbsolutePath();
                } else {
                    filnamn = "exempel";
                }

                filnamn = filnamn+".txt";
                FileWriter fw = null;
                try {
                    fw = new FileWriter(filnamn);
                } catch (IOException g) {
                    g.printStackTrace();
                }
                assert fw != null;
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter outFile = new PrintWriter(bw);
                        outFile.println(textArea1.getText());
                    outFile.flush();
                    outFile.close();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiNotePad");
        GuiNotePad gui = new GuiNotePad();
        frame.setContentPane(gui.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setJMenuBar(gui.menuBar);
        frame.setVisible(true);

    }
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton newButton;
    private JButton saveButton;
    private JButton openButton;
    private JButton saveAsButton;
}
