package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColourFrame extends JFrame implements ActionListener {

    JButton changeColour = new JButton("Colour");
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel up = new JPanel();
    JPanel down = new JPanel();
    Color colour = new Color(50,100,100);
    Color white = new Color(255,255,255);
    int pressedCount= 0;

    final int HEIGHT = 100;
    final int WIDTH = 250;

    JColourFrame(){
        super();
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());

        add(BorderLayout.CENTER, changeColour);
        add(BorderLayout.NORTH, up);
        add(BorderLayout.SOUTH, down);
        add(BorderLayout.WEST, left);
        add(BorderLayout.EAST, right);

        changeColour.addActionListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String [] args){
        new JColourFrame().show();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        pressedCount++;

        if (pressedCount == 1){
            up.setBackground(colour);
        }

        else if (pressedCount == 2){
            right.setBackground(colour);
        }

        else if (pressedCount == 3){
            down.setBackground(colour);
        }

        else if (pressedCount == 4){
            left.setBackground(colour);
        }

        else{
            up.setBackground(white);
            left.setBackground(white);
            down.setBackground(white);
            right.setBackground(white);
            pressedCount = 0;
        }
    }
}
