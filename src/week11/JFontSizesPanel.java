package week11;

import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel extends JPanel {

    JFrame frame = new JFrame();

    final int HEIGHT = 100;
    final int WIDTH = 250;

    int size = 14;
    JLabel[] text = new JLabel[size];
    Font[] fontSize = new Font[size];

    Font baseFont = new Font("arial", Font.BOLD, 6);

    JFontSizesPanel(){
        super();
        frame.setLayout(new GridLayout());
        frame.setDefaultCloseOperation(3);
        frame.setSize(WIDTH, HEIGHT);
        fontSize[0] = baseFont;

        for(int i = 0; size>i; i++){
            Font biggerFont = fontSize[i].deriveFont(Font.BOLD, 6+i);
            fontSize[i] = biggerFont;
            text[i] = new JLabel("Hello");
            text[i].setFont(fontSize[i]);
            add(text[i]);

        }

    }

    public static void main(String[] args){
        new JFontSizesPanel().show();
    }
}
