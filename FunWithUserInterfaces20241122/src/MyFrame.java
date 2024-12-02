import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import java.util.Scanner;
import java.io.File;

public class MyFrame extends JFrame {
    private JTextArea tarStory;
    public void setupMenu() {
        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);
        JMenu mnuFile = new JMenu("File");
        JMenu mnuHelp = new JMenu("Help");
        mbar.add(mnuFile);
        JMenuItem miOpen = new JMenuItem("Open");
        miOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    try {
                        Scanner fsc = new Scanner(chooser.getSelectedFile());
                        String text = "";
                        String line;
                        while (fsc.hasNextLine()) {
                            line = fsc.nextLine();
                            text = text + "\n" + line;
                        }
                        fsc.close();
                        tarStory.setText(text);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,"An error occurred.");
                    }
                }
            }
        });
        mnuFile.add(miOpen);
        JMenuItem miClear = new JMenuItem("Clear");
        miClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tarStory.setText("");
            }
        });
        mnuFile.add(miClear);
        JMenuItem miExit = new JMenuItem("Exit");
        miExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mnuFile.add(miExit);
        mbar.add(mnuHelp);
        JMenuItem miAbout = new JMenuItem("About");
        miAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // popup dialog
                JOptionPane.showMessageDialog(null,"This application was developed with love.");
            }
        });
        mnuHelp.add(miAbout);
    }
    public void setupGUI() {
        setBounds(300,300,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My First User Interface in Java");
        Container c = getContentPane();   // gets hold of the content pane where I can add lightweight components
        c.setLayout(new BorderLayout());
        JPanel panEast = new JPanel();
        GridLayout gl = new GridLayout(2,2);
        panEast.setLayout(gl);
        JButton btnOne = new JButton("one");
        btnOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,"One is the loneliest number.");
                tarStory.setText(tarStory.getText() + " " + "One is the loneliest number.");
            }
        });
        JButton btnTwo = new JButton("two");
        JButton btnThree = new JButton("three");
        JButton btnFour = new JButton("four");
        panEast.add(btnOne);
        panEast.add(btnTwo);
        panEast.add(btnThree);
        panEast.add(btnFour);
        c.add(panEast,BorderLayout.EAST);
        tarStory = new JTextArea();
        tarStory.setEditable(false);
        c.add(tarStory,BorderLayout.CENTER);
        JPanel panNorth = new JPanel();
        FlowLayout fl = new FlowLayout();
        panNorth.setLayout(fl);
        JLabel lblEnterText = new JLabel("Enter content: ");
        panNorth.add(lblEnterText);
        JTextField txtAddThis = new JTextField(20);
        panNorth.add(txtAddThis);
        JButton btnOK = new JButton("OK");
        panNorth.add(btnOK);
        btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String typedText = txtAddThis.getText();
                String currentText = tarStory.getText();
                tarStory.setText(currentText + " " + typedText);
                txtAddThis.setText(""); // for convenience for user
            }
        });
        c.add(panNorth,BorderLayout.NORTH);
        setupMenu();
    }
    /*
    @Override
    public void paint(Graphics g) {
        super.paint(g);  // backgrounds and borders are properly rendered as well as lightweight components
        g.drawOval(50,100,50,50);
        g.setColor(Color.RED);
        g.fillRect(200,200,100,75);
    }
    */
    public MyFrame() {
        setupGUI();
    }
}
