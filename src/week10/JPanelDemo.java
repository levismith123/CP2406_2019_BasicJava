package week10;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {

    final int WIDTH = 250;
    final int HEIGHT = 100;

//    Color colour = new Color(0,200,100);
//    Color colour2 = new Color(200,200,200);
    Font font = new Font("Harrington", Font.PLAIN, 20);
    JFlexiblePanel panel1 = new JFlexiblePanel(Color.red, Color.green, font, "Hello");
    JFlexiblePanel panel2 = new JFlexiblePanel(Color.red, Color.green, font, "Hello");
    JFlexiblePanel panel3 = new JFlexiblePanel(Color.red, Color.green, font, "Hi");
    JFlexiblePanel panel4 = new JFlexiblePanel(Color.red, Color.green, font, "Hello");

    JPanelDemo(){
        super();
        setLayout(new GridLayout());
        setSize(WIDTH, HEIGHT);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new JPanelDemo().show();
    }
}
