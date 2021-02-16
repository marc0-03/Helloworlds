import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GuiNotePad {
    JMenuBar menuBar;

    public GuiNotePad() {

        //Where the GUI is created:
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

//Create the menu bar.
        menuBar = new JMenuBar();

//Build the first menu.
        menu = new JMenu();
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

//a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Both text and icon",
                new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(menuItem);

        menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);

//a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

//a group of check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);

//a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("Another item");
        submenu.add(menuItem);
        menu.add(submenu);

        //Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);

        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  //Create a new file and if a file is open and has been changed, prompt user to save

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
                String filnamn = fc.getSelectedFile().getAbsolutePath();
                FileReader fr = null;
                try {
                    fr = new FileReader(filnamn);
                } catch (FileNotFoundException E) {
                    E.printStackTrace();
                }
                BufferedReader inFile = new BufferedReader(fr);

                String line;
                textArea1.setText("");
                try {
                    while ((line = inFile.readLine()) != null) {
                        System.out.println(line);
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
}
