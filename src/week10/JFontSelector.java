package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {

    JButton arial = new JButton("Arial");
    JButton catang = new JButton("Batang");
    JButton cracked = new JButton("Cracked");
    JButton eurostile = new JButton("eurostile");
    JButton harrington = new JButton("Harrington");
    JButton decrease = new JButton("decrease");
    JButton increase = new JButton("increase");

    int fontSize = 12;

    Font arialFont = new Font("Arial", Font.PLAIN, fontSize);
    Font catangFont = new Font("Catang", Font.PLAIN, fontSize);
    Font crackedFont = new Font("Cracked", Font.PLAIN, fontSize);
    Font eurostileFont = new Font("Eurostile", Font.PLAIN, fontSize);
    Font harringtonFont = new Font("Harrington", Font.PLAIN, fontSize);

    JLabel text = new JLabel("text");

    final int HEIGHT = 200;
    final int WIDTH = 350;

    JFontSelector(){
        super();
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(arial); add(catang); add(cracked); add(eurostile); add(harrington); add(text, FlowLayout.TRAILING);
        add(decrease); add(increase);

        arial.addActionListener(this);
        catang.addActionListener(this);
        cracked.addActionListener(this);
        eurostile.addActionListener(this);
        harrington.addActionListener(this);
        decrease.addActionListener(this);
        increase.addActionListener(this);
    }

    public static void main(String[] args){
        new JFontSelector().show();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == arial){
            text.setFont(arialFont);
        }

        else if (actionEvent.getSource() == catang){
            text.setFont(catangFont);
        }

        else if (actionEvent.getSource() == cracked){
            text.setFont(crackedFont);
        }

        else if (actionEvent.getSource() == eurostile){
            text.setFont(eurostileFont);
        }

        else if (actionEvent.getSource() == harrington){
            text.setFont(harringtonFont);
        }

        else if (actionEvent.getSource() == decrease){
            Font smaller = text.getFont().deriveFont(Font.PLAIN, fontSize--);
            text.setFont(smaller);
        }

        else if (actionEvent.getSource() == increase){
            Font bigger = text.getFont().deriveFont(Font.PLAIN, fontSize++);
            text.setFont(bigger);
        }

    }
}
