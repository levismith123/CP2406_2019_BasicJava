package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JMovingFrame extends JFrame implements ActionListener {

    JButton movingButton = new JButton("Move");
    JLabel message = new JLabel("Move me!");
    Random random = new Random();


    final int ROWS = 5;
    final int COLS = 5;

    final int WIDTH = 500;
    final int HEIGHT = 200;

    JPanel[] panel = new JPanel[(ROWS*COLS)-1];



    JMovingFrame(){
        super();

        GridLayout layout = new GridLayout(ROWS,COLS);
        setLayout(layout);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(movingButton);

        for(int i= 0; i<panel.length; i++)
        {
            panel[i] = new JPanel();
            add(panel[i]);
            panel[i].setBackground(Color.green);
        }

        panel[0].add(message);
        setSize(WIDTH, HEIGHT);
        movingButton.addActionListener(this);
    }

    public static void main(String[] args){
        new JMovingFrame().show();
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int randNum = random.nextInt(ROWS*COLS-1);
        panel[randNum].add(message);
        repaint();

    }

}
