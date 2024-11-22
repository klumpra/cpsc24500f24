import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;

public class MyFrame extends JFrame {
    public void setupGUI() {
        setBounds(300,300,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("My First User Interface in Java");
        setBackground(Color.MAGENTA);
        Container c = getContentPane();   // gets hold of the content pane where I can add lightweight components
        c.setLayout(new BorderLayout());
        JButton btn1 = new JButton("One");
        btn1.setPreferredSize(new Dimension(100,100));
        JButton btn2 = new JButton("Two");
        JButton btn3 = new JButton("Three");
        c.add(btn1,BorderLayout.NORTH);
        c.add(btn3,BorderLayout.SOUTH);
        c.add(btn2,BorderLayout.CENTER);
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
