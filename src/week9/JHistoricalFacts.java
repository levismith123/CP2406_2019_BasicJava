package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {

    JButton button = new JButton("Next fact");
    JLabel label = new JLabel("Default");
    int buttonCount = 0;
    final int HEIGHT = 100;
    final int WIDTH = 250;

    JHistoricalFacts(){
        super();
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        add(label);
        add(button);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }

    public static void main(String[] args){
        new JHistoricalFacts().show();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        buttonCount++;
        switch (buttonCount){
            case 1: buttonCount = 1;
                label.setText("Historical fact 1");
                break;
            case 2: buttonCount = 2;
                label.setText("Historical fact 2");
                break;
            case 3: buttonCount = 3;
                label.setText("Historical fact 3");
                break;
            case 4: buttonCount = 4;
                label.setText("Historical fact 4");
                break;
            case 5: buttonCount = 5;
                label.setText("Historical fact 5");
                buttonCount = 0;
                break;
        }
    }
}
